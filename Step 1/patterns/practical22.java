package patterns;

import java.util.Scanner;

public class practical22 {
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
            if((i+j)%2==0)
            {
                System.out.print("1"+" ");
            }
            else
            {
                System.out.print("0"+" ");
            }
        }
        System.out.println();  
    }
    }
}
