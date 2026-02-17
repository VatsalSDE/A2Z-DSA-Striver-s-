
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

}

public class treerepresentation {
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(4);
        root.right=new Node(5);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
    }
}
