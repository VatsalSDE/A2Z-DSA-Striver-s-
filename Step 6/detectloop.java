import java.util.HashMap;
import java.util.Map;

// Node class for linked list
class Node{
    int data;
    Node next;

    Node(int data1 , Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }

}

// Detect cycle in linked list using HashMap approach
public class detectloop {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = null;

        // Approach: Use HashMap to track visited nodes
        // If we encounter same node again, there's a cycle
        Map <Node,Integer> mpp = new HashMap<>();
        Node temp=head;
        boolean flag=false;
        
        while (temp!=null) {
            if(mpp.containsKey(temp)==true){
                flag=true;  // Found cycle - node visited before
                break;
            }
            else{
                mpp.put(temp,1);  // Mark node as visited
                temp=temp.next;
            }
        }
        
        if(flag==true){
            System.out.println("yes it forms a cycle");
        }
        else{
            System.out.println("It does not forms the cycle");
        }

    }
}
