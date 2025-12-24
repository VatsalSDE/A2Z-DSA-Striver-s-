import java.util.HashMap;

public class longestsubarraywithsumkposiandnega {
    public static void main(String[] args) {
        int[] arr={-1,1,1};
        int n=arr.length;

        int k=0;
        HashMap<Integer, Integer> presum = new HashMap<>();

        int sum=0;
        int maxlen=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                maxlen=Math.max(maxlen, i+1);
            }

            // calculate the remaing part 
            int rem = sum-k;

            if(presum.containsKey(rem)){
                int len = i-presum.get(rem);
                maxlen=Math.max(maxlen, len);
            }
            if(!presum.containsKey(sum)){
                presum.put(sum, i);
            }
        }
        System.out.println(maxlen);
    }
}
