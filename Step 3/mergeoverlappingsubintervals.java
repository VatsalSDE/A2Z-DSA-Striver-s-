import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeoverlappingsubintervals {

    public static List<List<Integer>> bruteforcesolu(int[][] interv){
        // first will sort the intervals according to their start time
        Arrays.sort(interv,(a,b) -> a[0]-b[0]);
        List<List<Integer>> ans = new ArrayList<>();

        int n=interv.length;

        for(int i=0;i<n;i++){
            int start=interv[i][0];
            int end=interv[i][1];

            if(!ans.isEmpty() && end <= ans.get(ans.size()-1).get(1)){
            continue;
        }
            for(int j=i+1;j<n;j++){
                if(interv[j][0]<=end){
                    end=Math.max(end, interv[j][1]);
                }
                else{
                    break;
                }
            }
            
            ans.add(Arrays.asList(start,end));
        }
        return ans;
    }

    public static int[][] optimalmergeinterv(int[][] interv){
        // so here also will sort array okk 
        Arrays.sort(interv,(a,b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> ans = new ArrayList<>();
        int n=interv.length;

        for(int i=0;i<n;i++){
            int start =interv[i][0];
            int end=interv[i][1];

            if(!ans.isEmpty() && start<= ans.get(ans.size()-1).get(1)){
                ans.get(ans.size()-1).set(1,Math.max(end, ans.get(ans.size()-1).get(1)));
            }
            else{
                ans.add(Arrays.asList(start,end));
            }
        }
        // now we will convert the list to 2d array
        int[][] res = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            res[i][0]=ans.get(i).get(0);
            res[i][1]=ans.get(i).get(1);
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] intevrals= { {1,3} , {2,6} , {8,10} , {15,18} };

        // Bruteforce Solution
        List<List<Integer>> ans = new ArrayList<>();
        ans=bruteforcesolu(intevrals);
        System.out.println("The merged intervals are ");
        System.out.println(ans);
    }
}
