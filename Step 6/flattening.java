import java.util.ArrayList;
import java.util.Collections;

// Flatten a multilevel linked list (nodes have down pointers)
class Node {
    int data;
    Node next;
    Node child;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.child = null;
    }
}

public class flattening {

    // Convert ArrayList to child-linked list
    private static Node altoll(ArrayList<Integer> arr) {
        if(arr.size()==0){
            return null;
        }
        Node head=new Node(arr.get(0));
        Node temp=head;
        for(int i=1;i<arr.size();i++){
            Node newtemp=new Node(arr.get(i));
            temp.child=newtemp;
            temp=temp.child;
        }
        return head;
    }

    // Brute force flattening
    private static Node bruteflatten(Node head) {
        if (head == null) return null;

        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            arr.add(temp.data);

            Node child = temp.child;
            while (child != null) {
                arr.add(child.data);
                child = child.child;
            }
            temp = temp.next;
        }

        Collections.sort(arr);
        return altoll(arr);
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.child;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.child = new Node(10);

        head.next = new Node(2);
        head.next.child = new Node(10);

        head.next.next = new Node(1);
        head.next.next.child = new Node(7);
        head.next.next.child.child = new Node(11);
        head.next.next.child.child.child = new Node(12);

        head.next.next.next = new Node(4);
        head.next.next.next.child = new Node(9);

        head = bruteflatten(head);

        print(head);
    }
}
