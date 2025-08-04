package patterns;
import java.util.Scanner;

public class practical23 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of sides");
         n=sc.nextInt();


         for(i=1;i<=n;i++) //controls the rows
         {
            for(j=1;j<=n;j++)// controls the columns
            {
                
                if(i+j>n){
                System.out.print("*" + " ");
                }
                else{
                System.out.print(" "+ " ");
                }
                
            }
            System.out.println();
         }
    }
}
