import java.util.ArrayList;

public class maxcoins {
    public static void main(String[] args) {
        int[] denomi= {1,2,5,10,20,50,100,500,1000};
        int n=denomi.length;
        int value =43;

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=n-1;i>=0;i--){
            while(value>=denomi[i]){
                value -= denomi[i];
                arr.add(denomi[i]);
            }
        }

        System.out.println("The maximum number of the coins required are "+arr.size());
    }
}
