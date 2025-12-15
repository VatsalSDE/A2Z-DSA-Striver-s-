import java.util.Stack;

class Pair {
    int val, min;
    Pair(int val, int min) {
        this.val = val;
        this.min = min;
    }
}

class MinStack {
    Stack<Pair> st = new Stack<>();

    public void push(int x) {
        if (st.isEmpty()) {
            st.push(new Pair(x, x));
        } else {
            st.push(new Pair(x, Math.min(x, st.peek().min)));
        }
    }

    public void pop() {
        if (!st.isEmpty()) st.pop();
    }

    public int top() {
        return st.peek().val;
    }

    public int getMin() {
        return st.peek().min;
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();  // ✅ create an object of MinStack
        ms.push(10);
        ms.push(15);
        ms.push(5);

        System.out.println("Top: " + ms.top());
        System.out.println("Min: " + ms.getMin());
        ms.pop();
        System.out.println("Min after pop: " + ms.getMin());
    }
}
