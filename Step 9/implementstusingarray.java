class stack{
    int size=10000;
    int[] arr=new int[size];
    int top=-1;

    void push(int x){
        top++;
        arr[top]=x;
    }
    int pop(){
        int x=arr[top];
        top--;

        return x;
    }
    int peek(){
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
        int topmost = st.peek();
        int length=st.size();

        System.out.println(topmost);
        System.out.println(length);
    }
}
