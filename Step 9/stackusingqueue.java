import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackusingqueue {

    Queue<Integer> qt = new LinkedList<>();

    public void push(int x){
        qt.add(x);
        int size=qt.size();

        for(int i=0;i<size-1;i++){
            qt.add(qt.remove());
        }
        System.out.println("The element is pushed into the queue");
    }
    public void pop(){
        qt.remove();
    }
    public void peek(){
        System.out.println("The top element is "+ qt.peek());
    }
    public void isempty(){
        System.out.println("Is the stack empty? " + qt.isEmpty());
    }
    public int size(){
        return qt.size();
    }
    public static void main(String[] args) {
        stackusingqueue mb= new stackusingqueue();
        mb.push(10);
        mb.push(20);
        mb.push(30);
        mb.peek();
        mb.pop();
        mb.peek();
        mb.isempty();
        System.out.println("The size of the stack is "+ mb.size());
    }
}
