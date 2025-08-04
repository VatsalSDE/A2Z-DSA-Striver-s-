package Conditionals;
import java.util.Scanner;

public class threedigit {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int a=sc.nextInt();

    if(a>99 && a<1000)
    {
        System.out.println("It is a  three digit number");
    }
    else
    {
        System.out.println("The number is not a three digit number");
    }
}    
}
