import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findmedian {
    private List<Integer> nums;

    public findmedian(){
        nums = new ArrayList<>();
    }

    public void addnum(int num){
        nums.add(num);
    }

     public double findMedian() {
        // Sort the list
        Collections.sort(nums);

        // Get size
        int n = nums.size();

        // If odd, return middle
        if (n % 2 == 1) {
            return nums.get(n / 2);
        }

        // If even, return average of two middle
        return (nums.get(n / 2 - 1) + nums.get(n / 2)) / 2.0;
    }


    public static void main(String[] args) {
        findmedian fm = new findmedian();
        fm.addnum(1);
        fm.addnum(3);
        System.out.println(fm.findMedian()); // Output: 2.0
        fm.addnum(5);
        System.out.println(fm.findMedian()); // Output: 3.0
    }
}
