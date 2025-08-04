package patterns;
import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row=sc.nextInt();


        for(int i=1;i<=row;i++)
        {
            if(i%2!=0)
            {
            for(int j=1;j<=i;j++)
            {
              System.out.print(j + " ");
            }
        }
        else{
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64) + " ");
            }
        }
            System.out.println();
        }
    }
}
