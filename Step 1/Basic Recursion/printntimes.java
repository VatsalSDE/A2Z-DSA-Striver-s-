import java.util.Scanner;

public class printntimes {
    private static void print(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello Vatsal");
        print(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print something");
        int n=sc.nextInt();

        print(n);
    }
}
