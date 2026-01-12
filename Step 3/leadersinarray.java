import java.util.ArrayList;
import java.util.Collections;

public class leadersinarray {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        int n=arr.length;

        // Bruteforce Solution
        // ArrayList<Integer> all = new ArrayList<>();

        // for(int i=0;i<n;i++){
        //     boolean flag=true;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]<arr[j]){
        //             flag=false;
        //             break;
        //         }
        //     }
        //     if(flag){
        //         all.add(arr[i]);
        //     }
        // }
        // System.out.println(all);

        // Optimal Solution
        ArrayList<Integer> all = new ArrayList<>();
        all.add(arr[n-1]);
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                all.add(arr[i]);
                max=arr[i];
            }
        }
        // to make them in the order okk s done reverse 
        Collections.reverse(all);
        System.out.println(all);
    }
}
