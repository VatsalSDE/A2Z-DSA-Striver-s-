import java.util.ArrayList;
import java.util.Scanner;

// This will print only one subsequence 

public class printonesubsequence {
    private static boolean printsubsequence(int ind , ArrayList<Integer> drr ,int s , int sum , int[] arr , int n ){
        if(ind==n){
            if(s==sum){
                System.out.println(drr);
                return true;
            }
            else {
            return false;
            }
        }
        // now the take portion
        drr.add(arr[ind]);
        s+=arr[ind];
        if(printsubsequence(ind+1,drr,s,sum,arr,n) == true) return true;
        s-=arr[ind];
        drr.remove(drr.size()-1);

        // now the not take portion
        if(printsubsequence(ind+1,drr,s,sum,arr,n) == true) return true;

        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n=3;
        int sum=2;
        ArrayList <Integer> drr = new ArrayList<>();

        printsubsequence(0,drr,0,sum,arr,n);
    }
}