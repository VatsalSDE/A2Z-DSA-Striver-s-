package Conditionals;
import java.util.Scanner;

public class greatestof3usnest {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number A");
    int a=sc.nextInt();
    System.out.println("Enter the numbert B");
    int b=sc.nextInt();
    System.out.println("Enter the number C");
    int c=sc.nextInt();

    if(a>b)
    {
        if(a>c)
        {
            System.out.println("largest number is"+a);
        }
        else
        {
            System.out.println("largest number is"+c);
        }
    }
    else
    {
        if(b>c)
        {
            System.out.println("largest number is "+b);
        }
        else
        {
            System.out.println("largest number is "+c);
        }
    }
}    
}
