package Conditionals;
import java.util.Scanner;

public class profitloss {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);

    System.out.println("Enter the cost price of the product");
    int cp=sc.nextInt();

    System.out.println("Enter the Selling price of the product");
    int sp=sc.nextInt();

    int profit=sp-cp;
    int loss=cp-sp;

    if(cp>sp)
    {
       
        System.out.println("Loss ocurred of"+" "+loss);
    }
    else if(cp==sp)
    {
        System.out.println("No loss no profit occured");
    }
    else
    {
        
        System.out.println("Profit Occured"+" "+profit);
    }
}    
}
