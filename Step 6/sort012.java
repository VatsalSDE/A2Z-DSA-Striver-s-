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

public class sort012 {
    private static void print(ListNode head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    private static ListNode brutesolution(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        int count0=0;
        int count1=0;
        int count2=0;

        ListNode temp = head;

        // counting no of 0's 1's and 2's present in the linked list
        while(temp!=null){
            if(temp.data==0) count0++;
            else if(temp.data==1) count1++;
            else count2++;

            temp=temp.next;
        }
        // placing the temp again to head for data replacement 
        temp=head;

        while(temp!=null){
            if(count0>0){
                temp.data=0;
                count0--;
            }
            else if(count1>0){
                temp.data=1;
                count1--;
            }
            else{
                temp.data=2;
                count2--;
            }
            temp=temp.next;
        }
        return head;
    }

    // some optimized code 
    private static ListNode optsol(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        // dummy linked list
        ListNode zerohead=new ListNode(-1);
        ListNode zero=zerohead;

        ListNode onehead=new ListNode(-1);
        ListNode one=onehead;

        ListNode twohead=new ListNode(-1);
        ListNode two=twohead;

        ListNode temp=head;

        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=temp;
            }
            else if(temp.data==1){
                one.next=temp;
                one=temp;
            }
            else{
                two.next=temp;
                two=temp;
            }
            temp=temp.next;
        }
        // now joining the three linked list

        zero.next=(onehead.next!=null)?onehead.next:twohead.next;
        one.next=twohead.next;
        two.next=null;

        return zerohead.next;   
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(0);
        ListNode fourth=new ListNode(2);
        ListNode fifth=new ListNode(1);
        ListNode sixth=new ListNode(0);
        ListNode seventh=new ListNode(2);
        ListNode eight=new ListNode(1);
        ListNode ninth=new ListNode(0);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;
        seventh.next=eight;
        eight.next=ninth;
        ninth.next=null;
        
        System.out.println("The original linked list is ");
        print(head);

        System.out.println("The sorted linked list is of 0's 1's and 2's ");
        head=brutesolution(head);
        print(head);

        System.out.println("The little optimized one");
        head=optsol(head);
        print(head);
    }
}
