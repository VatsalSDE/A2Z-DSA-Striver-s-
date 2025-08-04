package patterns;
import java.util.Scanner;

public class pattern3 {
public static void main(String[] args) {
    int i,j,rows;
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
         rows=sc.nextInt();

         

         for(i=1;i<=rows;i++) //controls the rows
         {
            for(j=1;j<=rows;j++)// controls the columns
            {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
         }
}    
}
