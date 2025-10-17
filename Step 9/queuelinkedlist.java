class queuenode{
    int data;
    queuenode next;

    queuenode(int data){
        this.data=data;
        this.next=null;
    }
}

public class queuelinkedlist {
    queuenode start=null , end=null;
    int size =0;

    boolean isempty(){
        return start==null;
    }

    int peek(){
        if(isempty()){
            return -1;
        }
        return start.data;
    }
    void push(int x){
        queuenode newnode=new queuenode(x);
        if(isempty()){
            start=newnode;
            end=newnode;
        }
        else{
            end.next=newnode;
            end=newnode;
        }
        size++;
    }

    int pop(){
        if(isempty()){
            return -1;
        }
        int popped= start.data;
        start=start.next;
        size--;

        if(start==null){
            end=null;
        }
        return popped;
    }

    int size(){
        return size;
    }
    public static void main(String[] args) {
        queuelinkedlist qt = new queuelinkedlist();
        qt.push(5);
        qt.push(2);
        qt.push(8);
        System.out.println(qt.peek());
        System.out.println(qt.pop());
        System.out.println(qt.size());
    }
}
