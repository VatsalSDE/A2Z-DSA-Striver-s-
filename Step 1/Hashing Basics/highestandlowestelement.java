import java.util.HashMap;
import java.util.Map;

public class highestandlowestelement {
    public static void main(String[] args) {
        int[] arr={12,13,15,13,12,13};
        
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
        
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        // Traverse through map and find the elements
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }
        System.out.println("Maximum occurring element is " + maxEle + " with frequency " + maxFreq);
        System.out.println("Minimum occurring element is " + minEle + " with frequency " + minFreq);
    }
}
