import java.util.Stack;

// Node class for linked list palindrome check
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

// Check if linked list is palindrome - two approaches
public class palindrome {
    // Approach 1: Brute force using stack - O(n) space
    public static boolean palibrute(ListNode head){
         Stack <Integer> st = new Stack<>();
         ListNode temp=head;

        // Push all elements to stack
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;

        // Compare with popped elements (reverse order)
        while(temp!=null){
            int check=st.pop();
            if(temp.data!=check){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }

    // Helper: Reverse linked list recursively
    private static ListNode reverserecursive(ListNode head){
        if(head == null || head.next ==null){
            return head;
        }
        ListNode newnode =reverserecursive(head.next);
        ListNode front = head.next;
        front.next=head;
        head.next=null;

        return newnode;
    }

    // Approach 2: Optimal - find middle, reverse second half, compare
    public static boolean palioptimal(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Find middle using slow-fast pointers
        while(fast.next!=null && fast.next.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2: Reverse second half
        ListNode newhead = reverserecursive(slow.next);

        // Step 3: Compare first half with reversed second half
        ListNode first = head;
        ListNode second = newhead;

        boolean flag=true;
        while(second!=null){
            if(first.data!=second.data){
                flag=false;
                break;
            }
            else{
                first=first.next;
                second=second.next;
            }
        }

        // Step 4: Restore original list structure
        reverserecursive(newhead);

        return flag;
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

        // boolean ans = palibrute(head);
        // if(ans==true){
        //     System.out.println("Yes the string is palindrome");
        // }
        // else{
        //     System.out.println("The string is not palindrome");
        // }

        // optimal

        boolean ans = palioptimal(head);
        if(ans==true){
            System.out.println("Yes the string is palindrome");
        }
        else{
            System.out.println("The string is not palindrome");
        }
    }
}
