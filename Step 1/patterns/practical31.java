package patterns;
import java.util.Scanner;

public class practical31 {
public static void main(String[] args) {
    int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of sides");
         n=sc.nextInt();

         for(i=1;i<=n;i++)
         {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" "+" ");
            }
         
         for(j=1;j<=i;j++)
         {
            System.out.print(j+" ");
         }
         for(j=i-1;j>=1;j--)
         {
            System.out.print(j+" ");
         }
         System.out.println();
        }
}    
}
