import java.util.Stack;

public class sumofsubarrranges {
    public static void main(String[] args) {
        int[] nums ={1,2,3};
        int n = nums.length;

        int[] PSE = new int[n];   // previous smaller (strict)
        int[] NSE = new int[n];   // next smaller (<=)
        int[] PGE = new int[n];   // previous greater (strict)
        int[] NGE = new int[n];   // next greater (>=)

        Stack<Integer> st = new Stack<>();

        // ---------- PSE (previous smaller: strictly less) ----------
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) st.pop();
            PSE[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        // ---------- NSE (next smaller: <=) ----------
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) st.pop();
            NSE[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        st.clear();

        // ---------- PGE (previous greater: strictly greater) ----------
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i]) st.pop();
            PGE[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        // ---------- NGE (next greater: >=) ----------
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) st.pop();
            NGE[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        // ---------- CONTRIBUTIONS ----------
        long sumMax = 0, sumMin = 0;

        for (int i = 0; i < n; i++) {
            long leftMin = i - PSE[i];
            long rightMin = NSE[i] - i;
            long leftMax = i - PGE[i];
            long rightMax = NGE[i] - i;

            sumMin += nums[i] * leftMin * rightMin;
            sumMax += nums[i] * leftMax * rightMax;
        }
        long result = sumMax - sumMin;
        System.out.println("The sum of subarray ranges is: " + result);
    }
}
