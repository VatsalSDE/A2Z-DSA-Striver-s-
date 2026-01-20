import java.util.Collections;
import java.util.PriorityQueue;

public class findmedianoptimal {

    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public findmedianoptimal(){
         maxHeap = new PriorityQueue<>(Collections.reverseOrder());
         minHeap = new PriorityQueue<>();
    }

    public void addNum(int num){
        // Step 1: add to maxHeap
        maxHeap.offer(num);

        // Step 2: move largest from maxHeap to minHeap
        minHeap.offer(maxHeap.poll());

        // Step 3: balance sizes
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian(){
         if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }

        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
    public static void main(String[] args) {
        
    }
}
