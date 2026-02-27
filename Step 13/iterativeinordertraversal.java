import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativeinordertraversal {

    public List<Integer> inordertr(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();

        Node current=root;

        while(true){
            if(current!=null){
                st.push(current);
                current=current.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                current=st.pop();
                ans.add(current.data);
                current=current.right;
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

        iterativeinordertraversal obj=new iterativeinordertraversal();
        List<Integer> result=obj.inordertr(root);
        System.out.println(result);
    }
}
