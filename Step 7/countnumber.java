import java.util.Scanner;

public class countnumber {
   static long MOD = 1_000_000_007;

    private static long power(long base , long exp){
        long result = 1;
        base %= MOD; // Reduce base initially

        while (exp > 0) {
            // If the exponent is odd, multiply the base with the result
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }

            // The exponent is now treated as even.
            // Square the base and halve the exponent.
            base = (base * base) % MOD;
            exp /= 2;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long n=sc.nextLong();
        long even=5;
        long odd=4;

        long totalevenpower= (n+1)/2;
        long totaloddpower= n/2;

        long evenindex=power(even,totalevenpower);
        long oddindex=power(odd,totaloddpower);

        long result= (evenindex * oddindex) % MOD;

        System.out.println("The result is "+result);
    }
}
