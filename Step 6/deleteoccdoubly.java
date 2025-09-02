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

public class deleteoccdoubly {
    // printing the linked list
    private static void print(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head=head.next;
        }
        System.out.println();
    }

    // converting the array to doubly linked list
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

    private static Node deleteocc(Node head , int key){
        Node temp = head;

        while(temp!=null){
            if(temp.data==key){
                if(temp==head){
                    head=temp.next;
                }

                Node nextnode = temp.next;
                Node prevnode = temp.back;

                if(nextnode != null) nextnode.back = prevnode;
                if(prevnode != null) prevnode.next = nextnode;

                temp=nextnode;
            }
            else{
                temp=temp.next;
            }
            
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr= {12,10,1,10,56,10,10,24,10};
        Node head =array2linkedlist(arr);

        int key = 10;

        head = deleteocc(head , key);
        System.out.println("The final output  after deletion is ");
        print(head);
    }
}
