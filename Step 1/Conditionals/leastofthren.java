package Conditionals;
import java.util.Scanner;

public class leastofthren {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number A");
    int a=sc.nextInt();
    System.out.println("Enter the numbert B");
    int b=sc.nextInt();
    System.out.println("Enter the number C");
    int c=sc.nextInt();

    if(a<=b && a<=c)
    {
        System.out.println("smallest number is "+a);
    }
    else if(b<=a && b<=c)
    {
        System.out.println("smallest number is "+b);
    }
    else
    {
        System.out.println("Smallest number is "+c);
    }
   }
}
