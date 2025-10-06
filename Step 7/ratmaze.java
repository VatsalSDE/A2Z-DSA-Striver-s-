import java.util.ArrayList;

class Solution {
    
    /**
     * RAT IN A MAZE PROBLEM - BACKTRACKING SOLUTION
     * 
     * PROBLEM: Find all possible paths for a rat to reach from top-left (0,0) 
     * to bottom-right (n-1,n-1) in a maze where:
     * - 1 = open path (rat can move)
     * - 0 = blocked path (rat cannot move)
     * 
     * APPROACH: Use backtracking with DFS to explore all possible paths
     * 
     * @param i - current row position of the rat
     * @param j - current column position of the rat  
     * @param a - the maze matrix (1=open, 0=blocked)
     * @param n - size of the n×n maze
     * @param ans - list to store all valid paths found
     * @param move - current path string being built (combination of D,L,R,U)
     * @param vis - visited matrix to avoid revisiting same cell in current path
     * @param di - direction array for row movements [Down, Left, Right, Up]
     * @param dj - direction array for column movements [Down, Left, Right, Up]
     */
    private static void solve(int i , int j, int[][] a , int n , ArrayList<String> ans , String move , int[][] vis , int[] di , int [] dj){

        // BASE CASE: If rat reaches the destination (bottom-right corner)
        if(i==n-1 && j==n-1){
            ans.add(move);  // Add the current path to our answer list
            return;         // Stop exploring this path
        }

        // Direction string: D=Down, L=Left, R=Right, U=Up
        // This corresponds to our di[] and dj[] arrays
        String dir="DLRU";

        // Try all 4 possible directions from current position
        for(int ind=0; ind < 4;ind++){
            // Calculate next position based on current direction
            int nexti=i+di[ind];  // next row
            int nextj = j+dj[ind]; // next column

            // CHECK IF NEXT MOVE IS VALID:
            // 1. nexti>=0 && nextj>=0 - not going out of bounds (top/left)
            // 2. nexti<n && nextj<n - not going out of bounds (bottom/right)  
            // 3. vis[nexti][nextj]==0 - cell not visited in current path
            // 4. a[nexti][nextj]==1 - cell is open (not blocked)
            if(nexti>=0 && nextj>=0 && nexti<n && nextj<n && vis[nexti][nextj]==0 && a[nexti][nextj]==1){
                
                // MAKE THE MOVE:
                vis[i][j]=1;  // Mark current cell as visited
                
                // RECURSIVE CALL: Explore from next position
                // Add current direction character to the path string
                solve(nexti, nextj, a, n, ans, move + dir.charAt(ind), vis, di, dj);
                
                // BACKTRACK: Unmark current cell as visited 
                // This allows other paths to use this cell
                vis[i][j]=0; 
            }
        }
    }
    
    /**
     * MAIN FUNCTION TO FIND ALL PATHS IN THE MAZE
     * 
     * This function sets up everything needed for the backtracking algorithm:
     * - Initializes visited matrix
     * - Sets up direction arrays 
     * - Calls the recursive solve function if starting position is valid
     * 
     * @param a - the n×n maze matrix where 1=open path, 0=blocked
     * @param n - size of the maze (n×n)
     * @return ArrayList of strings, each representing a valid path from (0,0) to (n-1,n-1)
     */
    public static ArrayList<String> findpath(int[][] a , int n){
        
        // STEP 1: Initialize visited matrix - keeps track of cells visited in current path
        // All cells start as unvisited (0)
        int[][] vis=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=0;  // 0 = not visited, 1 = visited
            }
        }
        
        // STEP 2: Set up direction arrays for 4-directional movement
        // These arrays work together: di[i] and dj[i] give the movement for direction i
        
        // Row direction array: how much to add to current row for each direction
        int[] di={1,0,0,-1};  // [Down, Left, Right, Up]
        
        // Column direction array: how much to add to current column for each direction  
        int[] dj={0,-1,1,0};  // [Down, Left, Right, Up]
        
        // EXPLANATION OF DIRECTION MAPPING:
        // Index 0: Down  -> di[0]=+1, dj[0]=0  (move down 1 row, same column)
        // Index 1: Left  -> di[1]=0,  dj[1]=-1 (same row, move left 1 column) 
        // Index 2: Right -> di[2]=0,  dj[2]=+1 (same row, move right 1 column)
        // Index 3: Up    -> di[3]=-1, dj[3]=0  (move up 1 row, same column)

        // STEP 3: Initialize result list to store all valid paths
        ArrayList<String> ans = new ArrayList<>();

        // STEP 4: Check if starting position (0,0) is valid before starting
        // Only start if the first cell is open (value = 1)
        if(a[0][0]==1){
            solve(0,0,a,n,ans,"",vis,di,dj);  // Start backtracking from (0,0)
        }
        // If starting position is blocked (0), no paths possible

        return ans;  // Return all found paths
    }
}

/**
 * RAT IN A MAZE - MAIN DRIVER CLASS
 * 
 * PROBLEM SUMMARY:
 * - We have a rat at position (0,0) in an n×n maze
 * - Rat needs to reach position (n-1,n-1) 
 * - Rat can only move through cells with value 1 (open paths)
 * - Rat cannot move through cells with value 0 (blocked paths)
 * - Find ALL possible paths from start to end
 * 
 * ALGORITHM: Backtracking with DFS
 * TIME COMPLEXITY: O(4^(n*n)) in worst case
 * SPACE COMPLEXITY: O(n*n) for recursion stack and visited matrix
 */
public class ratmaze {
    public static void main(String[] args) {
        
        // EXAMPLE MAZE: 4x4 grid
        int n=4;
        int[][] a = {{1,0,0,0},    // Row 0: Only first cell is open
                     {1,1,0,1},    // Row 1: Path continues down and right  
                     {1,1,0,0},    // Row 2: More open paths
                     {0,1,1,1}};   // Row 3: Path to destination
        
        // MAZE VISUALIZATION:
        // S = Start (0,0), E = End (3,3), 1 = Open, 0 = Blocked
        // [S][0][0][0]
        // [1][1][0][1] 
        // [1][1][0][0]
        // [0][1][1][E]

        // Call the static method directly from the class (no need for object)
        ArrayList<String> ans = Solution.findpath(a, n);

        // PRINT RESULTS:
        // If we found any valid paths, print them
        if(ans.size()>0){
            System.out.println("Found " + ans.size() + " path(s):");
            for(int i=0;i<ans.size();i++){
                System.out.println("Path " + (i+1) + ": " + ans.get(i));
            }
        }
        // If no paths found, print -1
        else{
            System.out.println("No path exists from start to destination: -1");
        }
        
        // EXAMPLE OUTPUT EXPLANATION:
        // Each character in the path string represents a move:
        // D = Down, L = Left, R = Right, U = Up
        // Example: "DDRDRR" means Down->Down->Right->Down->Right->Right
    }   
}
