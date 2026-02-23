import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majorityelementtwo {

    public List<Integer> mooreopt(int[] arr){
        int n=arr.length;

        // using the moore's voting algorithm

        int cnt1=0;
        int cnt2=0;

        int candi1=0;
        int candi2=0;

        for(int i=0;i<n;i++){
            if(arr[i]==candi1){
                cnt1++;
            }
            else if(arr[i]==candi2){
                cnt2++;
            }
            else if(cnt1==0){
                candi1=arr[i];
                cnt1=1;
            }
            else if(cnt2==0){
                candi2=arr[i];
                cnt2=1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1=0;
        cnt2=0;

        for(int i:arr){
            if(i==candi1){
                cnt1++;
            }
            else if(i==candi2){
                cnt2++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        if(cnt1>n/3){
            ans.add(candi1);
        }
        if(cnt2>n/3){
            ans.add(candi2);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};

        // so here we have to like the elements which appear more than n/3 times okk
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
       
        System.out.println("The majority elements are ");
        for(Integer key:mp.keySet()){
            if(mp.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }
}
