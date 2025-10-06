// Find intersection point of two linked lists (Y-shaped)
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
public class intersectingy {
    private static Node insertNode(Node head, int val) {
        Node newnode = new Node(val);

        if (head == null) {
            head = newnode;
            return newnode;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newnode;

        return head;
    }
    private static int getdifference(Node head, Node head2){
        int count1=0;
        int count2=0;

        while(head!=null){
            count1++;
            head=head.next;
        }

        while(head2!=null){
            count2++;
            head2=head2.next;
        }

        return count1-count2;
    }

    private static Node intersectionPresent(Node head , Node head2){
        int ans = getdifference(head, head2);

        if(ans<0){ // linked list 1 is longer
            while(ans!=0){
                ans++;
                head2=head2.next;
            }
        }
        else{ // linked list 2 is longer
            while(ans!=0){
                ans--;
                head=head.next;
            }
        }

        while(head!=null){
            if(head==head2){
                return head;
            }
            head=head.next;
            head2=head2.next;
        }

        return null;
    }

    public static Node intersectionoptimal(Node head , Node head2){
        if(head==null || head2==null) return null;
        Node temp1=head;
        Node temp2=head2;

        while(temp1!=temp2){
            temp1=temp1==null?head2:temp1.next;
            temp2=temp2==null?head:temp2.next;
        }

        return temp1;
    }

    private static void printList(Node head) {
    while(head.next != null) {
    System.out.print(head.data+"->");
        head = head.next;
    }
    System.out.println(head.data);
}


    public static void main(String[] args) {
        Node head = null;
        head = insertNode(head, 1);
        head = insertNode(head, 3);
        head = insertNode(head, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 4);
        Node head1 = head;
        head = head.next.next.next;
        Node headSec = null;
        headSec = insertNode(headSec, 3);
        Node head2 = headSec;
        headSec.next = head;
        // printing of the lists
        System.out.print("List1: ");
        printList(head1);
        System.out.print("List2: ");
        printList(head2);
        // checking if intersection is present
        // Node answerNode = intersectionPresent(head1, head2);
        // if (answerNode == null)
        //     System.out.println("No intersection\n");
        // else
        //     System.out.println("The intersection point is " + answerNode.data);

        Node answernode = intersectionoptimal(head1, head2);
        if(answernode==null){
            System.out.println("No intersection");
        }
        else{
            System.out.println("The intersection point is " + answernode.data);
        }
    }
}
