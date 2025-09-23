import java.util.ArrayList;
import java.util.Scanner;

public class printcountsubsequence {
    private static int printsubsequence(int ind , int s , int sum , int[] arr , int n ){
        if(ind==n){
            if(s==sum){
                return 1;
            }
            return 0;
        }
        // now the take portion
        s+=arr[ind];
        int left = printsubsequence(ind+1,s,sum,arr,n);
        s-=arr[ind];
        
        // now the not take portion
        int right = printsubsequence(ind+1,s,sum,arr,n);
        return left + right;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n=3;
        int sum=2;
        ArrayList <Integer> drr = new ArrayList<>();

        int ans = printsubsequence(0,0,sum,arr,n);
        System.out.println("The number of subsequences are : ");
        System.out.println(ans);
        
        
    }
}