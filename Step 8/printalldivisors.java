import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class printalldivisors {
    public static void main(String[] args) {
        int n=30;

        // bruteforce 

        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         System.out.print(i + " ");
        //     }
        // }

        // optimized 
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                arr.add(i);
                if(n/i!=i){
                    arr.add(n/i);
                }
            }
        }
        System.out.println(arr);
    }
}
