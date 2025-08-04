package patterns;
import java.util.Scanner;

public class pattern34 {
public static void main(String[] args) {
    int i,j,k;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int n=sc.nextInt();

    for(i=1;i<=n;i++)
         {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" "+" ");
            }
         
         for(j=1;j<=i;j++)
         {
            System.out.print("*"+" ");
         }
         for(j=i-1;j>=1;j--)
         {
            System.out.print("*"+" ");
         }
         
        
         
         System.out.println();
        }
        
   }    
}
