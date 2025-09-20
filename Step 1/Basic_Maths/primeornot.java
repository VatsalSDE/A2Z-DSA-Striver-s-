import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check that if it is prime or not ");
        int n=sc.nextInt();

        boolean flag =false;
        
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    flag=true;
                    break;
                }
            }

        if(flag==false){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    
    }
}
