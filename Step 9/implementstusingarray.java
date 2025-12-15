class stack{
    int size=10000;
    int[] arr=new int[size];
    int top=-1;

    void push(int x){
        top++;
        arr[top]=x;
    }
    int pop(){
        if(top==-1){
            System.out.println("The stack is empty ");
            return -1;
        }
        int x=arr[top];
        top--;

        return x;
    }
    int peek(){
        if(top==-1){
            System.out.println("The stack is empty ");
            return -1;
        }
        return arr[top];
    }
    int size(){
        return top+1;
    }

}
public class implementstusingarray {
    public static void main(String[] args) {

        stack st=new stack();
        st.push(3);
        st.push(12);
        st.pop();
        st.pop();
        int topmost = st.peek();
        int length=st.size();

        System.out.println(topmost);
        System.out.println(length);
    }
}
