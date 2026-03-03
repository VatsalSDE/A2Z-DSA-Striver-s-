import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        val = x;
        left = null;
        right = null;
    }
}
class Tuple{
    TreeNode node;
    int c;
    
    Tuple(TreeNode _node , int col){
        node = _node;
        c = col;
    }
}
public class topView {

    public static List<Integer> topviewTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;

        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Tuple> que=new LinkedList<>();

        que.offer(new Tuple(root, 0));

        while (!que.isEmpty()) {
            Tuple current=que.poll();
            TreeNode node=current.node;
            int col=current.c;
            if(!map.containsKey(col)){
                map.put(col, node.val);
            }
            if(node.left!=null){
                que.offer(new Tuple(node.left, col-1));
            }
            if(node.right!=null){
                que.offer(new Tuple(node.right, col+1));
            }
        }
        // we have to add the values from the map in the ascending order in refernec to the col value 
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);

        List<Integer> result = topviewTraversal(root);
        System.out.println(result); // Output: [2, 1, 3, 6]
    }
}
