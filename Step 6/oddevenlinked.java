import java.util.ArrayList;

// Node class for linked list
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

// Segregate odd and even positioned nodes - two approaches
public class oddevenlinked {

    // Approach 1: Store in array then rebuild - O(n) space
    private static ListNode brutesol(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ArrayList <Integer> arr=new ArrayList<>();

        ListNode temp=head;
        
        // Store all odd positioned nodes first
        while(temp!=null && temp.next!=null){
            arr.add(temp.data);
            temp=temp.next.next;
        }
        if(temp!=null) arr.add(temp.data); 

        // Then store all even positioned nodes
        temp=head.next;
        
        while(temp!=null && temp.next!=null){
             arr.add(temp.data);
             temp=temp.next.next;
        }
        if(temp!=null) arr.add(temp.data);

        // Replace original list data with segregated data
        temp=head;
        int i=0;

        while(temp!=null){
            temp.data=arr.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }

    // Approach 2: Optimal - rearrange links directly O(1) space
    private static ListNode optimaloddeven(ListNode head){
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evennode = head.next; // Keep reference to even list start
        
        // Separate odd and even positioned nodes
        while(odd.next!=null && even.next!=null){
            odd.next=even.next;  // Connect odd to next odd
            odd=odd.next;

            even.next=odd.next;  // Connect even to next even
            even=even.next;
        }
        
        // Connect end of odd list to start of even list
        odd.next=evennode;
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