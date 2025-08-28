import java.util.ArrayList;

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

public class sortlinkedlist {
    // printing method 
    private static void print(ListNode head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    // bruteforce method 
    private static ListNode sortbrute(ListNode head){
        if(head==null || head.next==null){
            return null;
        }

        // taking a arraylist to store the element and then reverse it
        ArrayList <Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.data);
            temp=temp.next;
        }

        for(int i=0;i<arr.size();i++){
            for(int j=i+1 ; j<arr.size() ;j++){
                if(arr.get(i)>arr.get(j)){
                    // swap
                    int t=arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,t);
            }
        }
        }
        // now we have the sorted array list so just replace the data
        temp=head;
        int i =0;
        while(temp!=null){
            temp.data=arr.get(i);
            temp=temp.next;
            i++;
        }
        return head;  
    }

    public static void main(String[] args) {
         ListNode head =new ListNode(1);
        ListNode first =new ListNode(3);
        ListNode second =new ListNode(2);
        ListNode third =new ListNode(3);
        ListNode fourth =new ListNode(1);
        ListNode fifth = new ListNode(12);

        head.next=first;
        first.next=second;  
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=null;

        System.out.println("The original linke dlist is ");
        print(head);

        System.out.println("After sorting the list is ");
        head=sortbrute(head);
        print(head);

    }
}
