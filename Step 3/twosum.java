import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int[] arr={2,5,4,3,1,6};
        int n=arr.length;

        HashMap<Integer,Integer> mp = new HashMap<>();
        int target=7;
        int remaing=0;
        int[] ans=new int[2];
        for(int i=0;i<n;i++){
            remaing=target-arr[i];
            if(mp.containsKey(remaing)){
                ans[0]=mp.get(remaing);
                ans[1]=i;
                break;
            }
            else{
                mp.put(arr[i], i);
            }
        }

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
