import java.util.List;

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


public class deletemiddle {
    //print function 
     private static void print(ListNode head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    // bruteforce
    private static ListNode deletmiddlebrute(ListNode head){
        if(head==null || head.next==null){
            return null;
        }
        // first count the length
        int count =0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        // now find the middle position
        int ans = count/2;
        temp=head;
        while(temp!=null){
            ans--;
            if(ans==0){
                temp.next=temp.next.next;
                return head;
            }
            temp=temp.next;
        }
        return head;
    }

    // optimal approach for this 
    private static ListNode optimdeletemiddle(ListNode head){
        if(head==null || head.next==null){
            return null;
        }

        ListNode slow =head;
        ListNode fast =head;

        fast=fast.next.next; // this for skipping the one step
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // now we have the slow pointing to the one node previous to middle
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
         ListNode head =new ListNode(1);
        ListNode first =new ListNode(3);
        ListNode second =new ListNode(2);
        ListNode third =new ListNode(3);
        ListNode fourth =new ListNode(1);
        ListNode fifth = new ListNode(12);

        head.next=first;
        first.next=second;  
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=null;

        System.out.println("The original linke dlist is ");
        print(head);

        System.out.println("after deleting the middle node ");
        head=deletmiddlebrute(head);
        print(head);
    }
}
