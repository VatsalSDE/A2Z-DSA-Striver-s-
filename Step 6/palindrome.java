import java.util.Stack;

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

public class palindrome {
    // bruteforce using stack
    public static boolean palibrute(ListNode head){
         Stack <Integer> st = new Stack<>();
         ListNode temp=head;

        // this is step 1 where we are pushing the linked list data in to the stack
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;

        while(temp!=null){
            int check=st.pop();
            if(temp.data!=check){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }

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

    // optimal :- middle -> reverse -> comparison
    public static boolean palioptimal(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        // here in the while first condition for odd length and second for the even length
        // step 1 finding the reverse 
        while(fast.next!=null && fast.next.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //step2 reversing the linked list
        ListNode newhead = reverserecursive(slow.next);

        // step 3 comaparison
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

        // again reverse the part of the linke dthat we reversed so the linked list comes in it state
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
