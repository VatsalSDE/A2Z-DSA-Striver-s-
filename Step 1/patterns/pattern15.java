package patterns;
import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no rows");
        row=sc.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int j=i;j<=row;j++){
           System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}
