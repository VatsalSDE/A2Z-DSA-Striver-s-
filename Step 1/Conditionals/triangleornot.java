package Conditionals;
import java.util.Scanner;

public class triangleornot {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the side 1");;
    int s1=sc.nextInt();

    System.out.println("Enter the side 2");;
    int s2=sc.nextInt();

    System.out.println("Enter the side 3");;
    int s3=sc.nextInt();

    if(s1+s2>s3 && s2+s3>s1 && s1+s3>s2)
    {
        System.out.println("The side can be of the triangle");
    }
    else
    {
        System.out.println("It can not be the sides of the triangle");
    }


}

}
