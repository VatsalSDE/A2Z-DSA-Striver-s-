class Node {
   int data;
   Node next;
   Node back;

   Node(int var1, Node var2, Node var3) {
      this.data = var1;
      this.next = var2;
      this.back = var3;
   }

   Node(int var1) {
      this.data = var1;
      this.next = null;
      this.back = null;
   }
}

public class removeduplicatesdoubly {
    // convert the array 2 linked list

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

    private static Node removedupli(Node head){
        Node temp=head;
        Node nextnode=temp.next;

        while(temp.next!=null){
            if(temp.data == nextnode.data){
                nextnode=nextnode.next;
            }
            else{
                temp.next=nextnode;
                nextnode.back=temp;
                temp=temp.next;
                nextnode=temp.next;
            }
        }

        return head;
    }
    // printing the linked list
    private static void print(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head=head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr= {1,1,1,4,4,4,5,5,7,8,8,8,8,9};
        Node head =array2linkedlist(arr);

        System.out.println("The linked list before deletion is ");
        print(head);
        
        head=removedupli(head);
        System.out.println("The list after deletion ");
        print(head);
    }
}
