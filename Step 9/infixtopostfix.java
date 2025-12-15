import java.util.Stack;

public class infixtopostfix {

    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "(p+q)*(m-n)";
        int n = s.length();
        StringBuilder ans = new StringBuilder(n);
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (s.charAt(i) == ')') {
                while (!st.empty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop();
            }
            else{
                while (!st.isEmpty() && Prec(ch) <= Prec(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        while (!st.isEmpty() ) {
            if (st.peek()=='(') {
                System.out.println("Invalid expression");
                break;
            }
            ans.append(st.pop());
        }

        System.out.println("The postfix string is "+ans);
    }
}
