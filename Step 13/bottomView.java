import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class tuple{
    Node node;
    int col;

    public tuple(Node node, int c) {
        this.node = node;
        this.col = c;
    }
}

public class bottomView {
    public static List<Integer> bottomtraversalview(Node root){
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;

        Queue<tuple> que = new LinkedList<>();
        que.offer(new tuple(root, 0));
        
        Map<Integer,Integer> mp=new TreeMap<>();

        while (!que.isEmpty()) {
            tuple curr=que.poll();
            Node current=curr.node;
            int col=curr.col;
            mp.put(col, current.data);
            if(current.left!=null){
                que.offer(new tuple(current.left, col-1));
            }
            if(current.right!=null){
                que.offer(new tuple(current.right, col+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
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
        List<Integer> bottomView = bottomtraversalview(root);
        System.out.println(bottomView); 
    }
}