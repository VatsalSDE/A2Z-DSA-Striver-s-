public class preordertarversal {

    public static void preorder(Node root){

        // base case 
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(4);
        root.right=new Node(5);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        preorder(root);
    }
}
