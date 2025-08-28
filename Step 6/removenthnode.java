class ListNode{
    int data;
    ListNode next;

    ListNode(int data1 , ListNode next1){
        this.data=data1;
        this.next=next1;
    }

    ListNode(int data1){
        this.data=data1;
        this.next=null;
    }

}

public class removenthnode {
    // bruteforce 
    private static ListNode brutenthnode(ListNode head , int n){
        if(head==null || (head.next==null && n==1) ){
            return null;
        }
        int count=0;
        // count number of nodes
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        // edge case if n is equal to lengthso delete head 
        if(count==n){
            // delete head node 
            return head.next;
        }

        // the node we have to reach
        int reach = (count-n);
        temp=head;

        while(temp!=null){
            reach--;
            if(reach==0){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    private static void print(ListNode head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    private static ListNode optimalsolu(ListNode head , int n){
        ListNode fast=head;
        ListNode slow=head;

        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        // edge case for deleting the head 
        if(fast==null){
            return head.next;
        }

        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode head =new ListNode(1);
        ListNode first =new ListNode(2);
        ListNode second =new ListNode(3);
        ListNode third =new ListNode(4);
        ListNode fourth =new ListNode(5);

        head.next=first;
        first.next=second;  
        second.next=third;
        third.next=fourth;
        fourth.next=null;

        System.out.println("The original linked list is ");
        print(head);

        // head=brutenthnode(head, 2);
        // System.out.println("The linked list after deleting the node from end is ");
        // print(head);

        // optimal
        head=optimalsolu(head, 2);
        System.out.println("The linked list after deleting the node from end is ");
        print(head);

    }
}
