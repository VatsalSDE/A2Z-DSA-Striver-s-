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

        for(int i=1;i<arr.length;i++){
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
    private static void print(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node removeHead(Node head){
        if(head == null) return head;
        head=head.next;
        return head;
    }

    private static Node removeTail(Node head){
        if(head == null || head.next==null) return head;
        Node temp = head;

        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    private static Node removeKthelement(Node head , int k){
        if(head == null) return head;
        if(k==1){
            head=head.next;
            return head;
        }

        int count=0;
        Node temp = head;
        Node prev = null;

        while(temp != null){
            count++;
            if(count == k){
               prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    private static Node removeelement(Node head , int ele){
        if(head == null) return head;
        if(head.data==ele){
            head=head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;

        while(temp != null){
            if(temp.data == ele){
               prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,63,7,12,17};
        // Node y = new Node(arr[2]);
        // System.out.println(y.data); 

        // this function converts the linked list to array
        Node head = convertArr2LL(arr);
        System.out.println(head.data);

        // this function prints the linked list
        System.out.println("Before deleting anything");
        print(head);

        

        // this function deletes the head from the linked list
        head = removeHead(head);
        System.out.println("After deleting the head");
        print(head);
        System.out.println("The new head is "+head.data);

        // this function deletes the tail node
        head = removeTail(head);
        System.out.println("After deleting the tail");
        print(head);
        
        // this function deletes the kth element from the linked list
        int k=2;
        head=removeKthelement(head, k);
        System.out.println("After removing the "+ k + " th element");
        print(head);
     
        // this function deletes the node with particular value
        int ele = 7;
        head = removeelement(head, ele);
        System.out.println("The linked list after deleting the element with value "+ele);
        print(head);

        // this function prints the length of linked list
        System.out.println("The length of linked list is "+lengthoflinked(head));

        // this function check if value is present in the linked list or not
        int val = 3;
        System.out.print(checkifPresent(head, val));
    }
}