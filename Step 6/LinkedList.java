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

public class LinkedList {
    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=0;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    private static int lengthoflinked(Node head){
        int cnt=0;

        Node temp=head;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }                                // traversal code 
        return cnt;
    }
     public static int checkifPresent(Node head, int desiredElement) {
        Node temp = head;

        // Traverse the linked list
        while (temp != null) {
            // Check if the current node's data is equal to the desired element
            if (temp.data == desiredElement)
                return 1;  // Return 1 if the element is found

            // Move to the next node
            temp = temp.next;
        }

        return 0;  // Return 0 if the element is not found in the linked list
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        // Node y = new Node(arr[2]);
        // System.out.println(y.data); 

        Node head = convertArr2LL(arr);
        // System.out.println(head.data);

        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }

        System.out.println("The length of linke dlist is "+lengthoflinked(head));

        int val = 3;
        System.out.print(checkifPresent(head, val));
    }
}
