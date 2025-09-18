import java.util.Scanner;

public class print1ton {
    private static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want to print from 1");
        int n=sc.nextInt();
        print(n);
    }
}
