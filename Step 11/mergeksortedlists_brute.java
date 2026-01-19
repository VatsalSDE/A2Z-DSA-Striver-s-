import java.util.ArrayList;
import java.util.Collections;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class mergeksortedlists_brute {

    private static ListNode convert2link(ArrayList<Integer> arr){
        // safety check if array list is null
        if(arr.size()==0) return null;

        ListNode head=new ListNode(arr.get(0));
        ListNode mover=head;
        for(int i=1;i<arr.size();i++){
            mover.next=new ListNode(arr.get(i));
            mover=mover.next;
        }
        return head;
    }
    
    private static ListNode mergekLists(ListNode[] ls){
        // safety check 
        if (ls == null || ls.length == 0) return null;  // safety

        ArrayList<Integer> arr = new ArrayList<>();
        for (ListNode list : ls) {
            ListNode current = list;
            while (current != null) {
                arr.add(current.val);
                current = current.next;
            }
        }
        if (arr.size() == 0) return null; // no elements
        
        // now will sort the array list
        Collections.sort(arr);
        
        // now will convert the array list to the linke dby calling the convert function
         return convert2link(arr);
    }
    public static void main(String[] args) {
        // now we will make the array of the linked list
        // Example: [[1,4,5],[1,3,4],[2,6]] so like this okk
        ListNode a = new ListNode(1);
        a.next = new ListNode(4);
        a.next.next = new ListNode(5);

        ListNode b = new ListNode(1);
        b.next = new ListNode(3);
        b.next.next = new ListNode(4);

        ListNode c = new ListNode(2);
        c.next = new ListNode(6);

        // so here this we made the array of the lists merge  okk
        ListNode[] lists = new ListNode[]{a, b, c};

        // now we will merge the array of linked list 
        ListNode mergedList = mergekLists(lists);
        // now we will print the merged linked list
        ListNode current = mergedList;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}