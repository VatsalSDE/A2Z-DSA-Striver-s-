public class dividewithoutoperator {
    private static int divide(int dividend , int divisor){
         // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // Determine sign
        boolean sign = (dividend >= 0) == (divisor >= 0);

        // Convert to long and take absolute values
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        int ans = 0;

        while (n >= d) {
            int cnt = 0;

            // Double divisor until it exceeds dividend
            while (n >= (d << (cnt + 1)) && (d << (cnt + 1)) > 0) {
                cnt++;
            }

            ans += 1 << cnt;
            n -= d * (1L << cnt);
        }

        return sign ? ans : -ans;
    }
    public static void main(String[] args) {
        int dividend=20;
        int divisor = 3;

        int ans = divide(dividend , divisor);

        System.out.println(ans);
    }
}
