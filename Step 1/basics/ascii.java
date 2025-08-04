package basics;
import java.util.Scanner;

public class ascii {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the character");
    char ch = sc.next().charAt(0);

     System.out.println((int)ch); // Typecating a characteer into numeric value
}    
}
