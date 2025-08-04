package loops;
import java.util.Scanner;

public class generlpr {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();

    //here the pattern is like that every term is multiplying with 2

    int a=1;
    for(int i=0;i<=n;i++)
    {
       
        System.out.println(a);
        a=a*2;
    }
}    
}
