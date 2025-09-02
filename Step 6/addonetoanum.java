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

public class addonetoanum {
    //printing the linked list

    private static void print(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }
    // reverse the linked list
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

    private static Node addnumber(Node head){
        // first reverse the linked list
        head=reverserecursive(head);
        Node temp=head;

        int carry=1;

        while(temp!=null){
             temp.data=temp.data+carry; // add one 
             if(temp.data<10){
                carry=0;
                break;
             }
             else{
                temp.data=0;
                carry=1;
             }
             temp=temp.next;
        }
        
        head=reverserecursive(head);

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
