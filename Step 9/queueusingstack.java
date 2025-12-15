import java.util.Stack;

public class queueusingstack {

    Stack<Integer> input= new Stack<>();
    Stack<Integer> output= new Stack<>();

    public void push(int x) {

        // step 1 input -> output
        while (input.empty() == false) {
            output.push(input.pop());
        }

        // step 2 x -> input
        input.push(x);

        // step 3 
        // output -->> input

        while(output.empty()==false){
             input.push(output.pop());
        }
    }
    
    public int pop() {
        return input.pop();
    }
    
    public int peek() {
        return input.peek();
    }
    
    public boolean empty() {
        return input.empty();
    }
    public static void main(String[] args) {
        queueusingstack qs= new queueusingstack();
        qs.push(10);
        qs.push(20);
        qs.push(30);
        System.out.println("The front element is "+ qs.peek());
        System.out.println("The element removed is "+ qs.pop());
        System.out.println("Is the queue empty? " + qs.empty());
    }
}