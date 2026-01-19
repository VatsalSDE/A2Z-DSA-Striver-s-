import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class mergeksortedlists_optima {
    private static ListNode mergekLists(ListNode[] lists){
        if(lists.length==0 || lists==null) return null;

        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b) -> a.val - b.val);
        // add the first element of each list to the pq
        for(ListNode node : lists){
            if(node!=null) pq.offer(node);
        }

        // now we will play with the heap that adding the smallest and making the links 
        ListNode dummy=new ListNode(0);
        ListNode mover =dummy;

        while(!pq.isEmpty()){
            ListNode smallest=pq.poll();
            mover.next=smallest;
            mover=mover.next;

            // now push the other elements of the smallest head list
            if(smallest.next!=null){
                pq.offer(smallest.next);
            }
        }
        return dummy.next;
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

        ListNode mergedList = mergekLists(lists);

        // print the merged list
        while(mergedList!=null){
            System.out.print(mergedList.val + " ");
            mergedList=mergedList.next;
        }
    }
}
