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

// Find length of loop in linked list - two approaches
public class lengthofloop {
    // Approach 1: HashMap to track position of each node
    private static int looplength(Node head){
        if(head == null || head.next == null){
            return 0;
        }
        Map <Node , Integer> mpp = new HashMap<>();
        int timer =1; // Track position in traversal
        Node temp=head;

        while(temp!=null){
            if(mpp.containsKey(temp)){
                // Found loop, return difference in positions
                return timer-mpp.get(temp);
            }
            else{
                mpp.put(temp,timer);
                timer++;
                temp=temp.next;
            }
        }
        return 0; // No loop found
    }

    // Approach 2: Tortoise-Hare method (optimal)
    private static int lengthoptimal(Node head){
        if(head==null || head.next==null){
            return 0;
        }

        Node slow=head;
        Node fast=head;

        // Step 1: Detect if loop exists using slow-fast pointers
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
               // Step 2: Loop detected, count its length
               int cnt=1;
               slow=slow.next;

               // Move slow until it meets fast again
               while(slow!=fast){
                    slow=slow.next;
                    cnt++;
               }
               return cnt;
            }
        }

        return 0; // No loop found
    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(92);
        Node third = new Node(23);
        Node fourth = new Node(84);
        Node fifth = new Node(65);
        Node sixth = new Node(15);
        Node seventh = new Node(20);
        Node eigth = new Node(12);
        Node ninth = new Node(25);
        Node tenth = new Node(28);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eigth;
        eigth.next = ninth;

        // here the node where the loop is created
        ninth.next = tenth;
        tenth.next=fifth;

        // int ans=looplength(head);
        // System.out.println("The length of loop is " + ans);

        int ans=lengthoptimal(head);
        System.out.println("The length of loop is "+ans);
    }
}
