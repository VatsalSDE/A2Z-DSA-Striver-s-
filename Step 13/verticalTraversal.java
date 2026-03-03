import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class Tuple{
    TreeNode node;
    int c;
    int r;

    Tuple(TreeNode _node, int col , int row) {
        node = _node;
        c = col;
        r = row;
    }
}

public class verticalTraversal {

    public static List<List<Integer>> verticalOrderTraversal(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();

        if(root==null){
            return ans;
        }

        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> que= new LinkedList<>();

        que.offer(new Tuple(root, 0, 0));

        while (!que.isEmpty()) {
            Tuple curr = que.poll();
            TreeNode node = curr.node;
            int c = curr.c;
            int r = curr.r;

            if(!map.containsKey(c)){
                map.put(c, new TreeMap<>());
            }
            if(!map.get(c).containsKey(r)){
                map.get(c).put(r, new PriorityQueue<>());
            }
            map.get(c).get(r).offer(node.val);
            if(node.left!=null){
                que.offer(new Tuple(node.left, c-1, r+1));
            }
            if(node.right!=null){
                que.offer(new Tuple(node.right, c+1, r+1));
            }
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> ys : map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes : ys.values()){
                while (!nodes.isEmpty()) {
                    ans.get(ans.size() - 1).add(nodes.poll());
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) { 
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform vertical order traversal
        List<List<Integer>> result = verticalOrderTraversal(root);
        System.out.println(result); // Output: [[4], [2], [1, 5, 6], [3], [7]]        
    }
}
