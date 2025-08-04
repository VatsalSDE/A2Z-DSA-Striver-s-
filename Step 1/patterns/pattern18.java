package patterns;
import java.util.Scanner;

public class pattern18 {
public static void main(String[] args) {
    int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no rows");
        row=sc.nextInt();

        int a=1;
    for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++){
           System.out.print( a + "  ");
            
           a++;
           
            }
            System.out.println();
        }
}    
}
