package patterns;
import java.util.Scanner;

public class pattern13 {
public static void main(String[] args) {
    int rows;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows");
    rows=sc.nextInt();

    for(int i=rows;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();

        
    }

    for(int i=rows;i>=1;i--)
    {
        for(int x=1;x<=i;x++)
        {
            System.out.print(x+ " ");
        }
        System.out.println();
    }
}    
}
