package patterns;

import java.util.Scanner;

public class pattern29 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
         n=sc.nextInt();


         for(i=1;i<=n;i++) //controls the rows
         {
             for(j=1;j<=n-i;j++)// controls the spaces

             {
                 System.out.print(" " + " ");
             }
            for(j=1;j<=2*i-1;j++)// controls the columns
            {
                System.out.print("*" + " ");
            }
            System.out.println();
         }
    }
    }

