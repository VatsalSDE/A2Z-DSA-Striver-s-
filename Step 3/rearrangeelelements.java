import java.util.ArrayList;

public class rearrangeelelements {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,-4};
        int n=arr.length;

        //bruteforce method 
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        for(int i=0;i<n/2;i++){
            arr[2*i]=pos.get(i);
            arr[2*i+1]=neg.get(i);
        }   
    }
}