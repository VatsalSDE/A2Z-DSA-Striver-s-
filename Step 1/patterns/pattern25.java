package patterns;

import java.util.Scanner;

public class pattern25 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of sides");
         n=sc.nextInt();


         for(i=1;i<=n;i++) //controls the rows
         {
             for(j=1;j<=n-i;j++)// controls the columns
             {
                 System.out.print(" " + " ");
             }
            for(j=1;j<=i;j++)// controls the columns
            {
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println();
         }
    }
    }

