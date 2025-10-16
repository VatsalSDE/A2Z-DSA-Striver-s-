import java.util.*;

public class QueryWiseSPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            int[] spf = buildSPFSieve(n);
            System.out.print("Prime factors of " + n + ": ");
            factorize(n, spf);
            System.out.println();
        }
    }

    static int[] buildSPFSieve(int N) {
        int[] spf = new int[N + 1];
        for (int i = 0; i <= N; i++) spf[i] = i;

        spf[0] = 0;
        if (N >= 1) spf[1] = 1;

        for (int i = 2; i * i <= N; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= N; j += i) {
                    if (spf[j] == j) spf[j] = i;
                }
            }
        }
        return spf;
    }

    static void factorize(int n, int[] spf) {
        while (n != 1) {
            System.out.print(spf[n] + " ");
            n /= spf[n];
        }
    }
}
