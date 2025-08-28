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

// Bruteforce for solving this question same logic of previous here just only
// return the node itself
// Map <ListNode , Integer> mpp = new HashMap<>();
// ListNode temp=head;

// if(head==null || head.next==null){
// return null;
// }

// while(temp!=null){
// if(mpp.containsKey(temp)){
// return temp;
// }
// else{
// mpp.put(temp,1);
// temp=temp.next;
// }
// }
// return null;

public class startingloop {
    private static Node startingloopoptimal(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        // optimized code using toroise hare algorithm
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)// step 1 completed
            {
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                } // step 2

                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(92);
        Node third = new Node(23);
        Node fourth = new Node(84);
        Node fifth = new Node(65);
        Node sixth = new Node(15);
        Node seventh = new Node(20);
        Node eigth = new Node(12);
        Node ninth = new Node(25);
        Node tenth = new Node(28);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eigth;
        eigth.next = ninth;

        // here the node where the loop is created
        ninth.next = fifth;

        Node ans = startingloopoptimal(head);
        System.out.println("The starting point index is " + ans.data);

    }
}
