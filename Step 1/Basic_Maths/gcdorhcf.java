import java.util.Scanner;

public class gcdorhcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int n1= sc.nextInt();
        System.out.println("Enter the number 2");
        int n2= sc.nextInt();

        int min=Math.min(n1 , n2);

        int gcd =0 ;

        for(int i=min;i>0;i--){
            System.out.println(i);
            if(n1%i==0 && n2%i==0){
                gcd=i;
                break;
            }
        }

        System.out.println("The Greatest Common divisor of the given two numbers is "+gcd);
    }
}
