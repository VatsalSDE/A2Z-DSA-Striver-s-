package patterns;
import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        int i,j,rows,cols;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
         rows=sc.nextInt();

         System.out.println("Enter the number of colimns");
        cols =sc.nextInt();

         for(i=0;i<rows;i++) //controls the rows
         {
            for(j=0;j<cols;j++)// controls the columns
            {
                System.out.print("* ");
            }
            System.out.println();
         }
         }
    }

