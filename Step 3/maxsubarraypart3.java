import java.util.ArrayList;

public class maxsubarraypart3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, -7, 2, 3};
        int n=arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        
        int currstart=0;
        int start=0;
        int end=-1;
        
        for(int i=0;i<n;i++){
            int currLen = i - currstart + 1;
                int bestLen = end - start + 1;

            if(arr[i]>=0){
                sum+=arr[i];
                if(sum>maxsum || (sum == maxsum && currLen > bestLen)){
                    maxsum=sum;
                    start=currstart;
                    end=i;
                }
            }
            else{
                sum=0;
                currstart=i+1;
            }
        }
        
        for(int i=start;i<=end;i++){
            ans.add(arr[i]);
        }
        
        if(ans.size()==0){
            ans.add(-1);
        }
        System.out.println(ans);

    }
}