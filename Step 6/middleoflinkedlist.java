// Node class for linked list
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

// Find middle of linked list - two approaches
public class middleoflinkedlist {

    private static void print(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head=head.next;
        }
        System.out.println();
    }
    
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

    // Approach 1: Count length, then traverse to middle position
    private static int middle(Node head , int len){
        int ans=(len/2)+1; // this is the position of the middle for both odd and even

        Node temp=head;
        int count=0;

        while(temp!=null){
            count++;
            
            if(count==ans){
                return temp.data;
            }
            temp=temp.next;
        }
        return 0;
    }

    // Approach 2: Tortoise and Hare - slow moves 1, fast moves 2
    private static int optimalmiddle(Node head , int len){
        Node slow=head;
        Node fast =head;

        if(len%2==0){
            // Even length: when fast reaches null, slow is at middle
            while(fast!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow.data;
        }
        else{
            // Odd length: when fast.next is null, slow is at middle
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow.data;
        }
        
    }
    public static void main(String[] args) {
        int[] arr={23,12,34,56,30,18};

        // array to linked list 
        Node head=convertArr2LL(arr);
        System.out.println("The linke dlist is ");
        print(head);

        //length of linked list is 
        int len = lengthoflinked(head);

        // middle of the linked list
        // int ans=middle(head , len);
        int ans=optimalmiddle(head, len);
        System.out.println("The middle element is "+ans);
    }
}
