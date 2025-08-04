package Conditionals;
import java.util.Scanner;

public class divisibleby5or3 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int a=sc.nextInt();

    if(a%5==0 || a%3==0)
    {
        System.out.println("The number is divisible by 5 or 3");
    }
    else
    {
        System.out.println("The number is not divisible by 5 or 3");
    }

}    
}
