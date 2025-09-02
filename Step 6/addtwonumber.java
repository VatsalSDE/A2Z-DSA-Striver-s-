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


public class addtwonumber {
    private static Node solubruopt(Node head1 , Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        Node dummNode = new Node(-1);
        Node current = dummNode;
        int carry =0;

        while(temp1 != null || temp2!=null){
            int sum=carry;

            // now by checking the node is there or reached null then add them to 

            if(temp1 != null) sum=sum+temp1.data;

            if(temp2 != null) sum=sum+temp2.data;

            Node newnode = new Node(sum%10);
            carry=sum/10;
            current.next=newnode;

            current=current.next;

            if(temp1!=null) temp1=temp1.next;
            if(temp2 != null) temp2=temp2.next;   
        }
        if(carry!=0){
            Node newnode = new Node(carry);
            current.next=newnode;
        }
        return dummNode.next;

    }
    private static void print(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head=new Node(3);
        Node second=new Node(5);
        head.next=second;

        Node head2=new Node(4);
        Node second2=new Node(5);
        Node third2=new Node(9);
        Node fourth2=new Node(9);

        head2.next=second2;
        second2.next=third2;
        third2.next=fourth2;

        // now just applying the function and taking out the reversed linked list 
        Node ans=solubruopt(head, head2);

        System.out.println("The final linke dlist after adding is ");
        print(ans);
    }
}
