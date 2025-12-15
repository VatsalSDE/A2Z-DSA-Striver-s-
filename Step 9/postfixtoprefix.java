import java.util.Stack;

public class postfixtoprefix {
    public static void main(String[] args) {
        String s ="AB-DE+F*/";
        int n=s.length();
        Stack<String> st = new Stack<>();

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(c+"");
            }
            else{
                String op1= st.pop();
                String op2= st.pop();
                String temp= c+op2+op1;
                st.push(temp);
            }
        }
        String ans= st.pop();
        System.out.println("The prefix expression is "+ans);
    }
}
