import java.util.Arrays;

// Majority Element: Sort array, element at middle index is majority (appears >n/2 times)
public class majorityelement {
    public static void main(String[] args) {
        int[] arr= {3,2,3};
        int n=arr.length;
        
        // Sort array - majority element will be at middle position
        Arrays.sort(arr);

        // Middle element must be majority since it appears >n/2 times
        System.out.println("The majority element is "+arr[n/2]);
    }
}
