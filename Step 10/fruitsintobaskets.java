import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class fruitsintobaskets {
    public static void main(String[] args) {
        int[] arr={3,3,3,1,2,1,1,2,3,3,4};
        int n=arr.length;

        int maxfruits=0;

        // Naive or Bruteforce Approach
        // for(int i=0;i<n;i++){
        //     int count =0;
        //     HashSet<Integer> mp = new HashSet<>();
        //     for(int j=i;j<n;j++){
        //         mp.add(arr[j]);
        //         if(mp.size()<=2){
        //             count++;
        //         }
        //         else if (mp.size()>2){
        //             break;
        //         }
        //     maxfruits=Math.max(maxfruits, count);
        //     }
        // }
        // System.out.println("The maximum number of fruits that can be collected in both baskets is "+maxfruits);

        // Better Approach 
        int left =0;
        int right=0;
        int maxlength=0;

        HashMap<Integer,Integer> mp=new HashMap<>();
        while(right<n){
            mp.put(arr[right], mp.getOrDefault(arr[right], 0)+1);
            if(mp.size()>2){
                while (mp.size()>2) {
                    int value = mp.get(arr[left]);
                    mp.put(arr[left], value-1);
                    if(mp.get(arr[left])==0){
                        mp.remove(arr[left]);
                    }
                    left++;
                }
            }
                int len=right-left+1;
                maxlength=Math.max(maxlength, len);
           
            right++;
        }
        System.out.println("The maximum number of fruits that can be collected in both baskets is "+maxlength);
    }
}