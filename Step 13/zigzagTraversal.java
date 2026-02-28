import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class zigzagTraversal {

     public List<List<Integer>> zigzagorder(Node root){
        List<List<Integer>> ans=new ArrayList<>();
        Queue<Node> que=new LinkedList<>();

        if(root==null){
            return ans;
        }

        que.add(root);
        
        int flag=0;

        while(!que.isEmpty()){
            int lev=que.size();

            List<Integer> arr=new ArrayList<>();

            for(int i=0;i<lev;i++){
                Node current=que.poll();
                arr.add(current.data);

                if(current.left!=null) que.add(current.left);
                if(current.right!=null) que.add(current.right);
            }

            if(flag==0){
                ans.add(arr);
                flag=1;
            }
            else{
                Collections.reverse(arr);
                ans.add(arr);
                flag=0;
            }    
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);

        zigzagTraversal obj=new zigzagTraversal();
        List<List<Integer>> result=obj.zigzagorder(root);
        System.out.println(result);
    }
}
