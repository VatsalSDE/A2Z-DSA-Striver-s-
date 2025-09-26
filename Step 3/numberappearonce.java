import java.util.HashMap;

public class numberappearonce {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,4,5,5,3,2};
        int n=arr.length;

        // there can be multiple solutions for this first by using the hashmap 
        // HashMap<Integer , Integer> mp = new HashMap<>();

        // for(int i=0;i<n;i++){
        //     if(mp.containsKey(arr[i])){
        //         mp.put(arr[i], mp.get(arr[i])+1);
        //     }
        //     else{
        //         mp.put(arr[i], 1);
        //     }
        // }

        // for(int i : mp.keySet()){
        //     if(mp.get(i)==1){
        //         System.out.println("The element that appears once is "+i);
        //     }
        // }

        //optimal 
        int xor=0;

        for(int i=0;i<n;i++){
            xor^=arr[i];
        }
        System.out.println("The single element present here is "+xor);
    }   
}
