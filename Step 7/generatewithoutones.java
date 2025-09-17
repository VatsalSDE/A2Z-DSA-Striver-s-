import java.util.ArrayList;
import java.util.Scanner;

public class generatewithoutones {
    private static void solve(int n , ArrayList<String> ans, int ind , String temp , boolean flag){
        if(ind==n){
            ans.add(temp);
            return;
        }

        if(!flag){
            solve(n,ans,ind+1,temp+ "0" ,false);
            solve(n,ans,ind+1,temp+ "1" ,true);
        }
        else{
            solve(n,ans,ind+1,temp+ "0" ,false);
        }
    }
    public static void main(String[] args) {
        ArrayList <String> ans = new ArrayList<>();
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        solve(n,ans,0,"",false);

        System.out.println(ans);
    }
}


// if asked with no adjacent zeroes
// class Solution {
//     private static void solve(int n , List<String> ans , int ind , String temp , boolean flag){
//         if(ind==n){
//             ans.add(temp);
//             return;
//         }

//         if(!flag){
//             solve(n,ans,ind+1,temp+ "0" ,true);
//             solve(n,ans,ind+1,temp+ "1" ,false);
//         }
//         else{
//             solve(n,ans,ind+1,temp+ "1" ,false);
//         }
//     }
//     public List<String> validStrings(int n) {
//         List<String> ans = new ArrayList<>();
//         solve(n, ans, 0, "", false); // fixed typo: sovle -> solve
//         return ans;
//     }
// }