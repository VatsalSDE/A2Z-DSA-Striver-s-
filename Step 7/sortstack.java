import java.util.Stack;

public class sortstack {
    private static void inserinstack(Stack <Integer> st , int temp){
        if(st.isEmpty() || st.peek()<=temp){
            st.push(temp);
            return;
        }
        int val=st.pop();

        inserinstack(st, temp);
        st.push(val);
    }
    private static void sort(Stack <Integer> st){
        if(st.isEmpty()){
            return;
        }
        int temp=st.pop();
        sort(st);

        inserinstack(st,temp);
    }
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(2);
        st.push(5);
        st.push(1);
        st.push(0);
        System.out.println("The original stack is "+st);
        sort(st);
        System.out.println("The stack after sorting is "+st);
    }
}
