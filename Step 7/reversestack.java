import java.util.Stack;

public class reversestack {
    private static void insertatbottom(Stack <Integer> st , int temp){
        if(st.isEmpty()){
            st.push(temp);
            return;
        }
        int val=st.pop();
        insertatbottom(st, temp);
        st.push(val);
    }
    private static void reverse(Stack <Integer> st){
        if(st.isEmpty()){
            return;
        }
        int temp=st.pop();
        reverse(st);

        insertatbottom(st,temp);
    }
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("The stack in its original form is "+st);
        reverse(st);
        System.out.println("The stack after reversal is "+st);
    }
}
