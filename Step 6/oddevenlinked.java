import java.util.ArrayList;

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

public class oddevenlinked {

    private static ListNode brutesol(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ArrayList <Integer> arr=new ArrayList<>();

        ListNode temp=head;
        
        // for odd index data
        while(temp!=null && temp.next!=null){
            arr.add(temp.data);
            temp=temp.next.next;
        }
        if(temp!=null) arr.add(temp.data); 

        // for even indexed data
        temp=head.next;
        
        while(temp!=null && temp.next!=null){
             arr.add(temp.data);
             temp=temp.next.next;
        }
        if(temp!=null) arr.add(temp.data);

        // now replacing the data
        temp=head;
        int i=0;

        while(temp!=null){
            temp.data=arr.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }

    private static ListNode optimaloddeven(ListNode head){
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evennode = head.next; // this node is for connecting the odd and even nodes linked list
        
        while(odd.next!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
        }
        odd.next=evennode; // connecting odd and even nodes linked list
        return head;
    }

    private static void print(ListNode head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head =new ListNode(1);
        ListNode first =new ListNode(3);
        ListNode second =new ListNode(2);
        ListNode third =new ListNode(3);
        ListNode fourth =new ListNode(1);

        head.next=first;
        first.next=second;  
        second.next=third;
        third.next=fourth;
        fourth.next=null;

        System.out.println("The original linked list is ");
        print(head);

        // ListNode anshead=brutesol(head);
        // System.out.println("The modified linked list is ");
        // print(anshead);

        ListNode anshead=optimaloddeven(head);
        System.out.println("The modified linked list is ");
        print(anshead); 

    }
}