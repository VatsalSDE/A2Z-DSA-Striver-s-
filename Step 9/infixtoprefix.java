import java.util.Stack;

public class infixtoprefix {

    private static int Prec(char ch) {
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

    // Reverse a string
    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Function to swap brackets after reversing
    private static String swapBrackets(String s) {
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                result.append(')');
            else if (ch == ')')
                result.append('(');
            else
                result.append(ch);
        }
        return result.toString();
    }

    private static String infixToPrefix(String s) {
        // Step 1: Reverse and swap brackets
        s = reverse(s);
        s = swapBrackets(s);

        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
            else if (ch == '(') {
                st.push(ch);
            }
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop();
            }
            else { // operator
                while (!st.isEmpty() &&
                        ((Prec(ch) < Prec(st.peek())) ||
                        (Prec(ch) == Prec(st.peek()) && ch != '^'))) {
                    result.append(st.pop());
                }
                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        // Step 2: Reverse postfix result to get prefix
        return reverse(result.toString());
    }

    public static void main(String[] args) {
        String s = "(p+q)*(c-d)";
        String ans = infixToPrefix(s);
        System.out.println("Prefix Expression: " + ans);
    }
}