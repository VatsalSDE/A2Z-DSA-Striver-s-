import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class foursum {

    public static List<List<Integer>> optimal4sum(int[] arr,int target){
        int n=arr.length;

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        for(int i=0;i<n;i++){

            if(i>0 && arr[i]==arr[i-1]) continue;

            for(int j=i+1;j<n;j++){
                if(j>i+1 && arr[j]==arr[j-1]) continue;

                int left=j+1;
                int right =n-1;

                while(left<right){
                    long sum = (long)arr[i]+arr[j]+arr[left]+arr[right];

                    if(sum<target) left++;
                    else if(sum>target) right--;
                    else{
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[left],arr[right]);
                        ans.add(temp);

                        left++;
                        right--;

                        while(left<right && arr[left]==arr[left-1]) left++;
                        while(left<right && arr[right]==arr[right+1]) right--;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int target=0;

        List<List<Integer>> ans = optimal4sum(arr,target);

        System.out.println(ans);
    }
}
