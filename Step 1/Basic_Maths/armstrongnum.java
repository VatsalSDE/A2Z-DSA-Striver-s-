import java.util.Scanner;

public class armstrongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int check=n;
        // first count digits
         int count = String.valueOf(n).length();

        int sum=0;
        while(n>0){
            int div=n%10;
            sum+=Math.pow(div, count);
            n=n/10;
        }

        if(sum==check){
            System.out.println("The given number is armstrong ");
        }
        else {
            System.out.println("The given number is not armstrong");
        }
    }
}
