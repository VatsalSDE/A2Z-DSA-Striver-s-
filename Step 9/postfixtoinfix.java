import java.util.Stack;

public class postfixtoinfix {
    public static void main(String[] args) {
        String s = "ab*cd/+";
        int n= s.length();

        String ans ="";
        Stack<String> st = new Stack<>();

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(c+"");
            }
            else{
                String op2= st.pop();
                String op1= st.pop();
                String temp= "("+op1+c+op2+")";
                st.push(temp);
            }
        }
        ans= st.pop();
        System.out.println("The infix expression is "+ans);
    }
}