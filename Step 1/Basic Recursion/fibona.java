import java.util.Scanner;

public class fibona {
    private static int fibo(int n){
        // recursive code for this
        if(n<=1){
            return n;
        }
        int last = fibo(n-1);
        int second=fibo(n-2); 

        return last + second;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the terms of Fibonacci you want");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        System.out.print(fibo(i) + " ");
        }
    }
}