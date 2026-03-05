import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rightorleftview {

    private static List<List<Integer>> levelorder(Node root){
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null){
            return arr;
        }
        
        Queue<Node> que=new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            int levelnum=que.size();
            List<Integer> ls=new ArrayList<>();

            for(int i=0;i<levelnum;i++){
                Node current=que.poll();
                ls.add(current.data);

                if(current.left!=null) que.add(current.left);
                if(current.right!=null) que.add(current.right);
            }
            arr.add(ls);
        }

        return arr;
    }

    private static List<Integer> rightView(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        ans=levelorder(root);
        List<Integer> res=new ArrayList<>();
        for(List<Integer> ls: ans){
            res.add(ls.get(ls.size()-1));
        }
        return res;
    }

    private static List<Integer> leftView(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        ans=levelorder(root);
        List<Integer> res=new ArrayList<>();
        for(List<Integer> ls: ans){
            res.add(ls.get(0));
        }
        return res;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.right.left=new Node(8);
        root.left.right.right=new Node(9);

        List<Integer> righList=rightView(root);
        System.out.println("The right view traversal is ");
        System.out.println(righList);
        
        List<Integer> leftList=leftView(root);
        System.out.println("The left view traversal is ");
        System.out.println(leftList);
    }
}
