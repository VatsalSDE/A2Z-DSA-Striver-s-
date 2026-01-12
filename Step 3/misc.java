import java.util.ArrayList;
import java.util.HashMap;

public class misc {


  public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int n=arr.length;

        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }

        // now we have to asign the elemnt in the pos and neg order
        int p=0;
        int ng=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=pos.get(p);
                p++;
            }
            else{
                arr[i]=neg.get(ng);
                ng++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        
  }
}