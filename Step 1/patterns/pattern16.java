package patterns;
import java.util.Scanner;

public class pattern16 {
public static void main(String[] args) {
    int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no rows");
        row=sc.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=3*i-1;j+=3){
           System.out.print(j + " ");
            }
            System.out.println();
        }
}    
}
