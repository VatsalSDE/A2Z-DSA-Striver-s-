package Methods;
import java.util.Scanner;

class entry{
    int add(int a, int b)
    {
        int sum= a+b;
        System.out.println("The Sum of numbers is");
        return sum;
        
    }
    int diff(int a, int b)
    {
        int diffe= a - b;
        System.out.println("The Difference of two numbers is");
        return diffe;
    }
    int multi(int a, int b)
    {
        int prod= a*b;
        System.out.println("The product of two numbers is ");
        return prod;
    }
    int divi(int a,int b)
    {
        int deeve=a/b;
        System.out.println("The division of two numbers is");
        return deeve;

    }
}
public class calculator {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number 1");
    int a=sc.nextInt();
    System.out.println("Enter the number 2");
    int b=sc.nextInt();

    entry call=new entry();
    System.out.println(call.add(a, b));
    System.out.println(call.diff(a, b));
    System.out.println(call.multi(a, b));
    System.out.println(call.divi(a, b));
}    
}
