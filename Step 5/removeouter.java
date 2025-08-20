import java.util.Scanner;

public class removeouter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();

        int count=0; // this count is for tracking the type of parenthis count so thst if it will be greater than 0 then print it 

        StringBuilder result = new StringBuilder();

        for(int i=0; i<n;i++){

            if(s.charAt(i) == '('){

                if(count > 0){
                result.append('(');
                }

                count++; // if '(' opening is found then increment it 
            }

            else {
                count--; // here if ')' is found then decrement the count and here we have written the statment first so that the the proper parenthesis are print

                if(count > 0){
                    result.append(')');
                }
            }

        }
        System.out.println(result.toString());
    }
}
