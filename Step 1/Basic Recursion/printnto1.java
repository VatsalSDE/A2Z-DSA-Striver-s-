import java.util.Scanner;

public class printnto1 {
    private static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want to print from n");
        int n=sc.nextInt();
        print(n);
    }
}
