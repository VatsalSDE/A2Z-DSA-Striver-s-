import java.util.Arrays;
import java.util.HashMap;

public class majorityelementnby2 {
    public static void main(String[] args) {
        int[] arr={2,2,2,6,6};
        int n=arr.length;

        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i], 1);
            }
        }
        for(HashMap.Entry<Integer,Integer> it : mp.entrySet()){
            if(it.getValue()>n/2){
                System.out.println("The majority element is "+it.getKey());
                break;
            }
        }
    }
}
