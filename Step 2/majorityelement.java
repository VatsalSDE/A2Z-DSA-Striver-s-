import java.util.Arrays;

public class majorityelement {
    public static void main(String[] args) {
        int[] arr= {3,2,3};
        int n=arr.length;
        Arrays.sort(arr);

        System.out.println("The majority element is "+arr[n/2]);
    }
}
