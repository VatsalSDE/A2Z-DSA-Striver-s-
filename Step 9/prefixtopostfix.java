import java.util.Stack;

public class prefixtopostfix {
    public static void main(String[] args) {
        String s = "/-AB*+DEF";
        int n =s.length();

        Stack<String> st = new Stack<>();
        for(int i=n-1 ;i>=0;i--){
            char c =s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(c+"");
            }
            else{
                String op1= st.pop();
                String op2= st.pop();
                String temp= op1+op2+c;
                st.push(temp);
            }
        }
        String ans= st.pop();
        System.out.println("The postfix expression is "+ans);
    }
}