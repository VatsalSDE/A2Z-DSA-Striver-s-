package patterns;

import java.util.Scanner;

public class pattern33 {
    public static void main(String[] args) {
        int i,j,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows");
    n=sc.nextInt();

    for( i=1;i<=2*n-1;i++)
    {
        System.out.print(i+" ");
    }
    System.out.println();
    n--;
    for(i=1;i<=n;i++)
         {
            for(j=1;j<=n+1-i;j++)
            {
                System.out.print(j+" ");
            }
            
         
         for(j=1;j<=2*i-1;j++)
         {
            System.out.print(" "+" ");
         }
         for(j=i+4;j<=2*n+1;j++)
         {
            System.out.print(j+" ");
         }
         System.out.println();
        }
    }
}
