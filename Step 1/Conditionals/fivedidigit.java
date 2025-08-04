package Conditionals;
import java.util.Scanner;

public class fivedidigit {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int a=sc.nextInt();

    if(a>9999 && a<10000)
    {
        System.out.println("The number is a five digiit number");
    }
    else{
        System.out.println("The number is not a five digit number");
    }
    
}    
}
