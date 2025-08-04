package Conditionals;
import java.util.Scanner;

public class greatestof3 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number A");
    int a=sc.nextInt();
    System.out.println("Enter the numbert B");
    int b=sc.nextInt();
    System.out.println("Enter the number C");
    int c=sc.nextInt();

   if(a>b && a>c)
   {
    System.out.println("A is  largest number"+a);
   }
   else if(b>a && b>c){
   System.out.println("B is larget number"+b);
   }
   else
   {
    System.out.println("C is largest "+c);
   }                                                                                                           
}    
}
