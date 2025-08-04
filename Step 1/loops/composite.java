package loops;
import java.util.Scanner;
public class composite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                System.out.print("Yes it is a composite number");

                break;
            }
            else if(n==1)
            {
                System.out.println("neither Prime number nor composite");
                break;
            }
            else
            {
                System.out.println("Prime Number");
                break;
            }
            
        }
        
    }
}
