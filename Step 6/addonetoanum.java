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

// Add 1 to a number represented as linked list
public class addonetoanum {
    // Print the linked list
    private static void print(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }
    
    // Reverse the linked list recursively
    private static Node reverserecursive(Node head){
        if(head == null || head.next ==null){
            return head;
        }
        Node newnode =reverserecursive(head.next);
        Node front = head.next;
        front.next=head;
        head.next=null;

        return newnode;
    }

    // Approach: Reverse -> Add 1 from end -> Handle carry -> Reverse back
    private static Node addnumber(Node head){
        // Step 1: Reverse to process from least significant digit
        head=reverserecursive(head);
        Node temp=head;

        int carry=1;  // We need to add 1

        // Step 2: Add 1 and handle carry propagation
        while(temp!=null){
             temp.data=temp.data+carry;
             if(temp.data<10){
                carry=0;  // No more carry needed
                break;
             }
             else{
                temp.data=0;  // Set to 0 and carry forward
                carry=1;
             }
             temp=temp.next;
        }
        
        // Step 3: Reverse back to original order
        head=reverserecursive(head);

        // Step 4: If carry remains, add new node at beginning
        if(carry==1){
            Node newnode = new Node(1);
            newnode.next=head;
            head=newnode;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(9);
        head.next=new Node(9);
        head.next.next=new Node(9);
        head.next.next.next=new Node(8);

        System.out.println("The original linked list");
        print(head);

        System.out.println("The linked list after adding one to it");
        head=addnumber(head);
        print(head);
    }
}
