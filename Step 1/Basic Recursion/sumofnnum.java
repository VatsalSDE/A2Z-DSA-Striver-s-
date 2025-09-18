import java.util.Scanner;

public class sumofnnum {
    private static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number");
        int n = sc.nextInt();

        int ans = sum(n);
        System.out.println("The sum of first "+n+" numbers is "+ans);
    }
}