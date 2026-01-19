import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class replaceelementsbyitsrank {
    public static void main(String[] args) {
        int[] arr ={20,15,26,2,98,6};
        int n=arr.length;

        // Bruteforce Solution okk so go for it now 
        // ArrayList<Integer> all = new ArrayList<>();

        // for(int i=0;i<n;i++){
        //     Set<Integer> small = new HashSet<>();
        //     for(int j=0;j<n;j++){
        //         if(arr[j]<arr[i]){
        //             small.add(arr[j]);
        //         }
        //     }
        //     int rank=small.size()+1;
        //     all.add(rank);
        // }
        // System.out.println("The rank wise array is ");
        // System.out.println(all);

        // Optimal Solution
        HashMap<Integer,Integer> mp = new HashMap<>();
        // now first we will create the clone of the array okk
        int[] unsorted=arr.clone();
        Arrays.sort(unsorted);

        // we have set the rank accordingly now 
        int rank=1;
        for(int i=0;i<n;i++){
            if(!mp.containsKey(unsorted[i])){
                mp.put(unsorted[i],rank);
                rank++;
            }
        }

        ArrayList<Integer> all = new ArrayList<>();
        for(int i=0;i<n;i++){
            all.add(mp.get(arr[i]));
        }
        System.out.println("The rank wise array is ");
        System.out.println(all);
    }
}
