package Conditionals;
import java.util.Scanner;

public class absolutenumb {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number ");
        int a=sc.nextInt();

        if(a<0)
        {
            System.out.println("The absolute number is");
            System.out.println(-a);
        }
        else
        {
            System.out.println("The absolute number is");
            System.out.println(a);
        }
    }
    
}
