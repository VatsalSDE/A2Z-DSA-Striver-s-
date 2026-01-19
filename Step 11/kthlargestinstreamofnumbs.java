import java.util.PriorityQueue;

public class kthlargestinstreamofnumbs {
    PriorityQueue<Integer> minHeap;
    int k;
    public kthlargestinstreamofnumbs(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
        }
    }
    public int add(int i){
        minHeap.add(i);
        while (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {4, 5, 8, 2};
        kthlargestinstreamofnumbs kthLargest = new kthlargestinstreamofnumbs(k, nums);
        System.out.println(kthLargest.add(3));   // returns 4
        System.out.println(kthLargest.add(5));   // returns 5
        System.out.println(kthLargest.add(10));  // returns 5
        System.out.println(kthLargest.add(9));   // returns 8
        System.out.println(kthLargest.add(4));   // returns 8
    }
}
