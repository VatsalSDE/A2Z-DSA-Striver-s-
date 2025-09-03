import java.lang.reflect.Array;
import java.util.ArrayList;

class Node {
   int data;
   Node next;
   Node back;

   Node(int var1, Node var2, Node var3) {
      this.data = var1;
      this.next = var2;
      this.back = var3;
   }

   Node(int var1) {
      this.data = var1;
      this.next = null;
      this.back = null;
   }
}

public class twosumlinked {
    // converting the array to doubly linked list
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
    private static ArrayList<ArrayList<Integer>> twosum(Node head , int sum){
        Node temp1=head;
        ArrayList <ArrayList<Integer>> arr=new ArrayList<>();

        while(temp1!=null){
            Node temp2=temp1.next;

            while(temp2!=null && temp1.data + temp2.data <= sum){
                if(temp1.data+temp2.data == sum){
                    ArrayList<Integer> pair=new ArrayList<>();
                    pair.add(temp1.data);
                    pair.add(temp2.data);
                    arr.add(pair);
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        return arr;

    }
    
    private static ArrayList<ArrayList<Integer>> optimtwosum(Node head,int sum){
        Node left = head;
        Node right =head ;
        //but right should be at tail so we will place the right at the tail of the linked list only 

        while(right.next!=null){
            right=right.next;
        }
        //after the above while loop now the right is at the tail of the linked list
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>(); // extra data structure for storing the answer

        while(left.data < right.data){
            if(left.data+right.data >= sum){
                if(left.data + right.data==sum){
                    ArrayList<Integer> pair=new ArrayList<>();
                    pair.add(left.data);
                    pair.add(right.data);
                    arr.add(pair);
                }
                right=right.back;
            }
            else{
                left=left.next;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr= {1,4,5,7,8,9};
        Node head =array2linkedlist(arr);

        int sum=5;
        // ArrayList<ArrayList<Integer>> ans=twosum(head , sum);
        // System.out.println(ans);

        // optimized approach
        ArrayList<ArrayList<Integer>> ans = optimtwosum(head, sum);
        System.out.println(ans);
    }
}