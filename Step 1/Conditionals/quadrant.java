package Conditionals;
import java.util.Scanner;

public class quadrant {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the x coordinate");
    int x=sc.nextInt();

    System.out.println("Enter the y coordinate");
    int y=sc.nextInt();

    if(x>0 && y>0)
    {
        System.out.println("point lies in 1st quadrant");
    }
    else if(x<0 && y>0)
    {
        System.out.println("point lies in 2nd quadrant");
    }
    else if(x<0 && y<0)
    {
        System.out.println("point lies in 3rd quadrant");
    }
    else if(x>0 && y<0)
    {
        System.out.println("point lies in 4th quadrant");
    }
    else
    {
        System.out.println("Origin point");
    }
}    
}
