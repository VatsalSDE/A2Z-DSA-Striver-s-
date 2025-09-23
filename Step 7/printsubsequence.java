import java.util.ArrayList;
import java.util.Scanner;

public class printsubsequence {
    public static int count=0;
    private static void printsubsequence(int ind , ArrayList<Integer> drr ,int s , int sum , int[] arr , int n ){
        if(ind==n){
            if(s==sum){
                count++;
                System.out.println(drr);    
            }
            return;
        }
        // now the take portion
        drr.add(arr[ind]);
        s+=arr[ind];
        printsubsequence(ind+1,drr,s,sum,arr,n);
        s-=arr[ind];
        drr.remove(drr.size()-1);

        // now the not take portion
        printsubsequence(ind+1,drr,s,sum,arr,n);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n=3;
        int sum=2;
        ArrayList <Integer> drr = new ArrayList<>();

        printsubsequence(0,drr,0,sum,arr,n);
        System.out.println(count);
    }
}