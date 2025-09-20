import java.util.HashMap;
import java.util.Map;

public class countelements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1,2,2,1,3,3,4,4,4,6,6,6,6};
        int n=arr.length;

        Map<Integer , Integer> mp = new HashMap<>();

        for(int i=0;i<n;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],1);
            }
        }
        System.out.println(mp);
    }
}