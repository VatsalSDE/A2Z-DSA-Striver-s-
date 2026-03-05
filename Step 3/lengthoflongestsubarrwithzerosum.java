import java.util.HashMap;

public class lengthoflongestsubarrwithzerosum {

    public static int brutesol(int[] arr){
        int n=arr.length;

        int max=0;

        for(int i=0;i<n;i++){
            int sum=0;

            for(int j=i;j<n;j++){
                sum+=arr[j];

                if(sum==0){
                    max=Math.max(max, j-i+1);
                }
            }
        }
        return max;
    }

    public static int optimalsol(int[] arr){
        int max=0;
        int sum=0;
        HashMap<Integer, Integer> presum = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum==0){
                max=Math.max(max, i+1);
            }

            int rem = sum-0;

            if(presum.containsKey(rem)){
                int len = i-presum.get(rem);
                max=Math.max(max, len);
            }
            if(!presum.containsKey(sum)){
                presum.put(sum, i);
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int[] arr = {9,-3,3,-1,6,-5};

        // int maxlength=brutesol(arr);
        // System.out.println(maxlength);

        int max=optimalsol(arr);
        System.out.println(max);

    }
}
