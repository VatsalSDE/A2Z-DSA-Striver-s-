import java.util.HashMap;

public class majorityelementtwo {
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
