import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelordertraversal {

    public List<List<Integer>> levelorder(Node root){
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

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        levelordertraversal obj=new levelordertraversal();
        List<List<Integer>> result=obj.levelorder(root);
        System.out.println(result);
    }
}
