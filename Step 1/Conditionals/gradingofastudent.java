package Conditionals;
import java.util.Scanner;

public class gradingofastudent {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the percentage of a student");
    int m=sc.nextInt();

    if(m>=81 && m<=100)
    {
        System.out.println("Very Good");
    }
    else if(m>=61 && m<=80)
    {
        System.out.println("good");
    }
    else if(m>=41 && m<=60)
    {
        System.out.println("average");
    }
    else
    {
        System.out.println("fail");
    }
}    
}
