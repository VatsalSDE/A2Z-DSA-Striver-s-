import java.util.*;

public class generateparanthesis {
    public static void generatepare(int open, int close ,int n,String s){

        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n){
        generatepare(open+1, close, n, s+"(");
        }
        if(close<open){
        generatepare(open, close+1, n, s+")");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        generatepare(0,0,n,"");
    }
}