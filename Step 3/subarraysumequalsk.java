import java.util.HashMap;

public class subarraysumequalsk {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k=3;

        int prefixsum=0;
        int count=0;

        HashMap<Integer, Integer> mp=new HashMap<>();
        mp.put(0,1);
        
        for(int i=0;i<arr.length;i++){
            prefixsum+=arr[i];

            if(mp.containsKey(prefixsum-k)){
                count+=mp.get(prefixsum-k);
            }

            mp.put(prefixsum,mp.getOrDefault(prefixsum, 0)+1);
        }
        System.out.println("The sub arrays with sum equal to k are "+count);
        
    }
}
