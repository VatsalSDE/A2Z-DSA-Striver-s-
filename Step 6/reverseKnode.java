// Reverse linked list in groups of K nodes
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

public class reverseKnode {
    // Reverse a linked list segment and return new head
    private static Node reverseLinkedList(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev; // prev is new head of reversed segment
    }

    // Return k-th node starting from node 'start' (1-based). If fewer than k nodes, return null.
   private static Node getKthNode(Node start, int k) {
        if (start == null || k <= 0) return null;
        int steps = k - 1; // we are already at 1st node
        Node cur = start;
        while (cur != null && steps > 0) {
            cur = cur.next;
            steps--;
        }
        return cur;
    }

    // Reverse list in groups of k
   private static Node kReverse(Node head, int k) {
        if (head == null) return null;
        if (k <= 0) throw new IllegalArgumentException("k must be > 0");
        if (k == 1) return head; // no change

        Node current = head;
        Node prevLast = null; // last node of the previous processed group
        boolean firstGroup = true;

        while (current != null) {
            Node kth = getKthNode(current, k);
            if (kth == null) {
                // Remaining nodes fewer than k: connect them as-is
                if (prevLast != null) prevLast.next = current;
                break;
            }

            Node nextGroupHead = kth.next; // start of remaining list after this group
            kth.next = null; // detach current group

            // reverse this group; reversedHead is the node that was kth
            Node reversedHead = reverseLinkedList(current);

            if (firstGroup) {
                head = reversedHead;
                firstGroup = false;
            } else {
                prevLast.next = reversedHead;
            }

            // After reversing, 'current' is now the last node of this group
            prevLast = current;

            // Move to next group
            current = nextGroupHead;
        }

        return head;
    }

  private  static void printLinkedList(Node head) {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(2);

        System.out.print("Original Linked List: ");
        printLinkedList(head);

        head = kReverse(head, 4);

        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
}

