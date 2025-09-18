import java.util.Scanner;

public class factofnnum {
    private static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();

        int ans = fact(n);
        System.out.println("The factorial answer for "+n+" is "+ans);
    }
}