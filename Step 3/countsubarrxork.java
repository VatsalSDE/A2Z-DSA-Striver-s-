import java.util.HashMap;

public class countsubarrxork {

    public static int brutesolu(int[] arr , int k){
        int n=arr.length;
        int count=0;

        for(int i=0;i<n;i++){
            int xor=0;
            for(int j=i;j<n;j++){
                xor^=arr[j];

                if(xor==k){
                    count++;
                }
            }
        }
        return count;
    }

    public static int optimalxork(int[] arr,int k){
        int n=arr.length;
        HashMap<Integer,Integer> mp = new HashMap<>();

        int count=0;
        mp.put(0, 1);

        int xor=0;

        for(int i=0;i<n;i++){
            xor^=arr[i];

            int target=xor^k;
            if(mp.containsKey(target)){
                count+=mp.get(target);
            }
            mp.put(xor, mp.getOrDefault(xor, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int k=6; 

        // int ans = brutesolu(arr,k);
        // System.out.println(ans);

        // optimal solution 
        int ans = optimalxork(arr,k);
        System.out.println(ans);
    }
}
