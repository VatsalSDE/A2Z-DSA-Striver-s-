import java.util.HashMap;
public class subarraywithkdifferentintegers {

    private static int findsubarrk(int[] arr , int k){
        int n=arr.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        int left=0;
        int right=0;
        int count=0;

        while(right<n){
            mp.put(arr[right], mp.getOrDefault(arr[right], 0)+1);
            while(mp.size()>k){
                int leftnum=arr[left];
                mp.put(leftnum, mp.get(leftnum)-1);
                if(mp.get(leftnum)==0){
                    mp.remove(leftnum);
                }
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        int n=arr.length;
        int k=2;

        // Bruteforce Approach
        // int count=0;
        // HashMap<Integer,Integer> mp = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         mp.put(arr[j], mp.getOrDefault(arr[j], 0)+1);
        //         if (mp.size()>k){
        //             break;
        //         }
        //         if(mp.size()==k){
        //             count++;
        //         } 
        //     }
        //     mp.clear();
        // }
        // System.out.println(count);

        // Optimal Approach
        int result = findsubarrk(arr, k) - findsubarrk(arr, k-1);
        System.out.println(result);
    }
}