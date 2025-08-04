package Conditionals;
import java.util.Scanner;

public class areaperimrect {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int len,brd,per,are;

        System.out.println("Enter the  length of the rectangle");
         len=sc.nextInt();
        
        System.out.println("Enter the breatdh of the rectangle");
        brd=sc.nextInt();

        per=2*(len + brd);
        System.out.println("The perimeter of the rectangle is "+per);
        are=len *brd;
        System.out.println("The are of the rectangle is "+are);

        if(are > per)
        {
            System.out.println("The area is greater than perimeter");
        }
        else
        {
            System.out.println("The Perimeter is greater than the area");
        }
    }
}
