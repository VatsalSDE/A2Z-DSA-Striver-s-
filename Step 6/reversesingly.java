import java.util.Stack;

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

public class reversesingly {
    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }
    private static void print(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    // using stack data structure
    private static Node reversestack(Node head){
        Node temp=head;
        Stack <Integer> st = new Stack<>(); 

        // step 1 of inserting data into stack
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }

        // step 2 of popping out data in LIFO manner from stack
        temp=head;

        while(temp!=null){
            temp.data=st.pop();
            temp=temp.next;
        }

        return head;
    }

    public Node reverseListiterative(Node head) {
        if(head==null || head.next==null){
            return head;
        }

        Node temp=head;
        Node prev=null;

        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

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
    public static void main(String[] args) {
         int[] arr={12,23,34,45};

         Node head =convertArr2LL(arr);

         // original linked list
         System.out.println("The linked list before reverse");
         print(head);

         // linked list after reverse
        // head=reversestack(head);
        // System.out.println("The linked list after reverse");
        // print(head);

        // reverse using iteration done

        // reverse using recursion
        head=reverserecursive(head);
        System.out.println("The linked list after reverse using recursion");
        print(head);
    }
}
