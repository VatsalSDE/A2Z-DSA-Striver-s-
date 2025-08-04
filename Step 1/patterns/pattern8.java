package patterns;
import java.util.Scanner;

public class pattern8 {
public static void main(String[] args) {
    int row;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of rows");
    row=sc.nextInt();
    System.out.println();

    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j + " ");
        }
        System.out.println();  
    }
}    
}
