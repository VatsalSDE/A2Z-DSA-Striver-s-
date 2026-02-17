public class postordertraversal {

    public static void postorder(Node root){
        // base case 
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(4);
        root.right=new Node(5);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        postorder(root);
    }
}
