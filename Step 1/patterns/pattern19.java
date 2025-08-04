package patterns;
import java.util.Scanner;

public class pattern19 {
public static void main(String[] args) {
    int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no rows");
        row=sc.nextInt();
        int mid=0;
        if(row%2!=0)
        {
           mid=row/2+1;
        }
        if(row%2==0)
        {
            mid=row/2;
        }
        for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=row;j++)
        {
            if(i==mid || j==mid){
            System.out.print("*" + " ");
            }
            else
            {
                System.out.print(" "+ " " );
            }
        }
        System.out.println();  
    }
}    
}
