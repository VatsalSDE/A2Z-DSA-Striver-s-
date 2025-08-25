class Node{
    int data;
    Node next;
    Node back;

    Node(int data1 , Node next1 , Node back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }
}

public class reversedoubly {
    private static void print(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head=head.next;
        }
        System.out.println();
    }

    private static Node array2linkedlist(int[] arr){
        Node head = new Node(arr[0]);
        Node prev=head;

        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }

    private static Node reverselinkedlist(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node last=null;
        Node current=head;

        while(current!=null){
            // this 3 statements for swapping the links of nodes
            last=current.back;
            current.back=current.next;
            current.next=last;

            current=current.back; // this for moving the node 
        }

        return last.back;

    }
    public static void main(String[] args) {
        int[] arr={12,23,34,45,56};
        
        // coverting to linked list
        Node head = array2linkedlist(arr);
        print(head);

        // reverse the linked list
        head=reverselinkedlist(head);
        System.out.println("The linked list after reverse");
        print(head);
    }
}
