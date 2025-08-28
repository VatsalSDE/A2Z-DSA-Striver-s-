import java.util.HashMap;
import java.util.Map;

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

public class detectloop {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = null;

        // this is the map we have made for the traking or frequency can say 
        Map <Node,Integer> mpp = new HashMap<>();
        // now checking if it makes a cycle or not 
        // BRUTEFORCE
        Node temp=head;
        boolean flag=false;
        while (temp!=null) {
            if(mpp.containsKey(temp)==true){
                flag=true;
                break;
            }
            else{
                mpp.put(temp,1);
                temp=temp.next;
            }
        }
        if(flag==true){
            System.out.println("yes it forms a cycle");
        }
        else{
            System.out.println("It does not forms the cycle");
        }

    }
}
