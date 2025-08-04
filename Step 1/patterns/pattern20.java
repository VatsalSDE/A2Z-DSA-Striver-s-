package patterns;
import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no rows");
        row=sc.nextInt();
        for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=row;j++)
        {
            if(i==j || i+j==6 ){
            System.out.print("* ");
            }
            else
            {
                System.out.print(" "+" " );
            }
        }
        System.out.println();  
    }
}    
}

