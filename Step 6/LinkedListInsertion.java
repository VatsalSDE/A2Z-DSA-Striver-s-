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

public class LinkedListInsertion {

    private static void print(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;;
        }
        System.out.println();
    }

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

    private static Node insertNodeH(Node head , int value){
        Node temp = new Node(value , head);
        return temp;
    }
    private static Node insertNodeT(Node head , int value){
        if(head == null){
            return new Node(value);
        }
         Node temp=head;

         while(temp.next!= null){
            temp=temp.next;
         }
        Node newNode = new Node(value);
        temp.next=newNode;
        return head;
    }

    private static Node insertNodeKth(Node head , int value, int k){
        if(head==null) {
            if(k==1){
                return new Node(value);
            }
            else{
                return null; // Invalid position
            }
        }

        if(k==1){
            Node temp=new Node(value , head);
            return temp;
        }
        Node temp=head;
        int count=0;

        while(temp.next!=null){
            count++;

            if(count == k-1){
                Node x = new Node(value);
                x.next=temp.next;
                temp.next=x;
                return head;
            }
            temp=temp.next;
        }
        return head;
    }

    private static Node insertbeforevalue(Node head , int element, int value){
        if(head==null) {
           return null;
        }

        if(head.data==value){
            Node temp=new Node(element , head);
            return temp;
        }
        Node temp=head;

        while(temp.next!=null){

            if(temp.next.data == value){
                Node x = new Node(element,temp.next);
                temp.next=x;
                return head;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr={23,34,45,56,67,89};
        Node head=convertArr2LL(arr);

        // inserting the node at head
        int value=20;
        head=insertNodeH(head, value);
        System.out.println("The linked list after inserting the element "+value+" at head");
        print(head);

        // inserting the node at tail
        head=insertNodeT(head, value);
        System.out.println("The linked list after inserting the node at end");
        print(head);

        // inserting the node at kth position
        head=insertNodeKth(head, value, 3);
        System.out.println("After inserting at kth");
        print(head);

        // inserting the node at before the value
        head=insertbeforevalue(head, 15, 34);
        System.out.println("after inserting the element at before the particular value ");
        print(head);
    }
}
