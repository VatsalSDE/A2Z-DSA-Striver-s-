import java.util.Scanner;

public class mypower {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        double result=1;
        long nn= exponent;
        if(nn<0) nn=nn*-1;

        while(nn>0){
            if(nn%2==1){
                result=result * base;
                nn=nn-1;
            }
            else{
                base=base*base;
                nn=nn/2;
            }
        }
        if(exponent<0) result=1/result;

        System.out.println("The power of the following numbers is "+result);
    }
}
