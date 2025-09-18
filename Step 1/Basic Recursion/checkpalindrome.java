import java.util.Scanner;

public class checkpalindrome {
    private static boolean checkpalindrome(String s , int start , int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        return checkpalindrome(s, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int start=0;
        int end=s.length()-1;

        boolean flag = checkpalindrome(s,start,end);
        
        if(flag==true){
            System.out.println("The string is palindrome");
        }
        else
        {
            System.out.println("The string is not palindrome");
        }
    }
}
