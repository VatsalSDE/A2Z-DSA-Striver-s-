import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
        this.node = node;
        this.state = state;
    }
}
public class preinpostorderinonetraversal {

    
    public List<Integer> pre=new ArrayList<>();
    public List<Integer> Ino=new ArrayList<>();
    public List<Integer> post=new ArrayList<>();

    public void preinpost(Node root){
        Stack<Pair> st=new Stack<Pair>();
        st.push(new Pair(root, 1));
        if(root==null) return;

        while(!st.isEmpty()){
            Pair top=st.pop();

            // for the preorder okk
            if(top.state==1){
                pre.add(top.node.data);
                top.state++;

                st.push(top);

                if(top.node.left != null){
                    st.push(new Pair(top.node.left, 1));
                }
            }

            // fr the inorder like to see the right exist or not
            else if(top.state==2){
                Ino.add(top.node.data);
                top.state++;

                st.push(top);

                if(top.node.right != null){
                    st.push(new Pair(top.node.right, 1));
                }
            }

            // for the post order
            else{
                post.add(top.node.data);
            }
        }
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(4);
        root.right=new Node(5);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        preinpostorderinonetraversal tree=new preinpostorderinonetraversal();
        tree.preinpost(root);

        System.out.println("Preorder Traversal: " + tree.pre);
        System.out.println("Inorder Traversal: " + tree.Ino);
        System.out.println("Postorder Traversal: " + tree.post);
        
    }
}
