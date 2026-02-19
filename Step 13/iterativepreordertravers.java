import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativepreordertravers {

    public List<Integer> preordertr(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st=new Stack<>();

        if(root==null){
            return ans;
        }

        st.push(root);

        while(!st.isEmpty()){
            Node current=st.pop();
            ans.add(current.data);

            if(current.right != null) st.push(current.right);
            if(current.left != null) st.push(current.left);
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        iterativepreordertravers obj=new iterativepreordertravers();
        List<Integer> result=obj.preordertr(root);
        System.out.println(result);
    }
}
