import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class taskscheduler {
    public static void main(String[] args) {
        char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
        int n = 2;

        int[] freq = new int[26];
        for (char c : tasks) {
            freq[c - 'A']++;
        }

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : freq) {
            if (i > 0) {
                maxheap.offer(i);
            }
        }

        int time = 0;

        while (!maxheap.isEmpty()) {
            ArrayList<Integer> all = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                if (!maxheap.isEmpty()) {
                    int curr = maxheap.poll();
                    curr--;
                    if (curr > 0) {
                        all.add(curr);
                    }
                }
                time++;

                if (maxheap.isEmpty() && all.size() == 0) {
                    break;
                }
            }
            for (int i : all) {
                maxheap.offer(i);
            }
        }
        System.out.println("The minimum time required " + time);
    }
}