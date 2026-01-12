import java.util.Arrays;
import java.util.HashSet;

public class longestconsequencesubsequence {

    private static boolean linearsearch(int[] arr , int num){
        for(int i : arr){
            if(i==num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr ={102,4,100,1,101,3,2,1,1};
        int n=arr.length;

        // Bruteforce approach
        // int longest =1;
        // int count=0;

        // for(int i=0;i<n;i++){
        //     int x=arr[i];
        //     count=1;

        //     while(linearsearch(arr, x+1)){
        //         x=x+1;
        //         count++;
        //     }
        //     longest = Math.max(longest, count);
        // }
        // System.out.println(longest);

        // Better Approach
        // Arrays.sort(arr);
        // int lastsmaller=Integer.MIN_VALUE;
        // int longest=1;
        // int count=1;

        // for(int i=0;i<n;i++){
        //     if(arr[i]-1 == lastsmaller){
        //         count++;
        //         lastsmaller=arr[i];
        //     }
        //     else if(arr[i] != lastsmaller){
        //         lastsmaller=arr[i];
        //         count=1;
        //     }
        //     longest = Math.max(longest, count);
        // }
        // System.out.println(longest);

        // Optimal Approach using the hashset okk
        int longest=1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        
        // now here what is that we will check if it not contains the element -1 then we will further check okk so yess 
        int count=1;
        for(int i=0;i<n;i++){
            if(!hs.contains(arr[i]-1)){
                count=1;
                int x=arr[i];

                while(hs.contains(x+1)){
                    x=x+1;
                    count++;
                }
            }
            longest = Math.max(longest, count);
        }
        System.out.println(longest);
    }
}
