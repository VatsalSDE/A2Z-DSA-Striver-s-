class stack{
    private class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node top;
    int size;

    stack(){
        this.top=null;
        this.size=0;
    }

   public void stackpush(int x){
        node ele=new node(x);
        ele.next=top;
        top=ele;
        System.out.println("Element pushed");
        size++;
    }

  public  int stackpeek(){
        if(size==0){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

  public  int stackpop(){
        if(size==0){
            System.out.println("Stack is empty");
            return -1;
        }
        int popped=top.data;
        top=top.next;
        size--;
        return popped;
    }
   public int stacksize(){
        return size;
    }
   public void printstack(){
        node current=top;

        while(current!=null){
            System.out.println(current.data + " ");
            current=current.next;
        }
        System.out.println();
    }
}

public class stacklinkedlist {
    public static void main(String[] args) {
        stack st=new stack();

        st.stackpush(23);
        st.stackpush(30);
        st.stackpush(15);
        int n=st.stackpeek();
        System.out.println("the peek element is "+n);
        st.stackpop();
        st.printstack();
    }
}
