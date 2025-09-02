class Node{
    int data;
    Node next;
    Node back;

    Node(int data1 , Node next1 , Node back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }
}

public class DoublYLinkedList {

    private static void print(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head=head.next;
        }
        System.out.println();
    }

    private static Node array2linkedlist(int[] arr){
        Node head = new Node(arr[0]);
        Node prev=head;

        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }

    private static Node deletehead(Node head){
        if(head == null || head.next==null){
            return null;
        }

        Node prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;

        return head;
    }
    private static Node deleteTail(Node head){
        if(head == null || head.next==null){
            return null;
        }

        Node tail = head;

        while(tail.next!=null){
            tail=tail.next;
        }
        Node prev = tail.back;
        
        prev.next=null;
        tail.back=null;

        return head; 
    }
    private static Node deleteKth(Node head ,int k){
        Node temp=head;
        int count=0;

        // this condition will take us to the kth element 
        while(temp.next!=null){
            count++;
            if(count==k) break;
        }

        Node prev=temp.back; // this is pointing back of the kth element
        Node front =temp.next; // this is pointing to the front of the kth element

        if(prev==null && front==null){
            return null; // because only one element
        }

        else if(prev==null){
            return deletehead(head); // here we called the delete head function because if previous i null it means the elemnt is at head position
        }
        else if(front==null){
            return deleteTail(head); // here we called the delete tail function because if front is null it means the elemnt is at tail position
        }
        else{
            prev.next=front; // here we are connecting the previous element to the front element
            front.back=prev; // here we are connecting the front element to the previous element

            temp.next=null;
            temp.back=null;
        }
        return head;
    }
    private static void deleteNode(Node temp){
        // in this question we will never be asked to delete the head
        Node prev=temp.back;
        Node front=temp.next;

        if(front==null){
            prev.next=null; // if front is null then we are at tail position
            return;
        }
        else{
            prev.next=front; // connecting previous to front
            front.back=prev; // connecting front to previous

            temp.next=null;
            temp.back=null;
            return;
        }
    }

    private static Node insertHead(Node head , int value){
        Node newNode = new Node(value,head,null);
        head.back=newNode;

        return newNode;
    }
    private static Node insertTail(Node head , int value){
        if(head.next==null && head.back==null){
            return insertHead(head, value);
        }
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node prev=tail.back;
        Node newNode = new Node(value,tail,prev);

        tail.back=newNode;
        prev.next=newNode;

        return head;

    }

    private static Node insertatK(Node head , int k , int value){
        if(k==1){
            return insertHead(head, value);
        }
        Node temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                break;
            }
            temp=temp.next;
        }
        Node prev=temp.back;
        Node newNode = new Node(value, temp, prev);
        prev.next=newNode;
        temp.back=newNode;

        return head;
    }
    private static void insertatNode(Node temp , int value){
        Node prev=temp.back;
        Node newNode = new Node(value,temp,prev);
        prev.next=newNode;
        temp.back=newNode;
    }
    public static void main(String[] args) {
        int[] arr= {12,10,1,10,56,10,10,24,10};
        Node head =array2linkedlist(arr);
        
        System.out.print("The linked list is ");
        print(head);

        // deleting node from head
        head=deletehead(head);
        System.out.println("After deleting node from head");
        print(head);

        // deleting node from tail
        head=deleteTail(head);
        System.out.println("After deleting the node from tail");
        print(head);

        // deleting the node at the lth element
        int k=3;
        head=deleteKth(head, k);
        System.out.println("Deleting the "+k+" th element");
        print(head);

        // deleting the particular node
        deleteNode(head.next);
        System.out.println("After deleting the particular node");
        print(head);

        //------------------------------Insertion------------------------------------ // 
        // inserting the node at before head
        int value=200;
        head=insertHead(head, value);
        System.out.println("After inserting the node before head");
        print(head);

        // insering node before tail
        int tailvalue=0;
        head=insertTail(head, tailvalue);
        System.out.println("Inserting the node before tail");
        print(head);

        // inserting the node at kth position 
        head=insertatK(head, k, value);
        System.out.println("The linke dlist after inserting at kth position");
        print(head);

        // inserting the node before any node
        insertatNode(head.next.next.next.next,value);
        System.out.println("After inserting the node at before any node ");
        print(head);
    }
}
