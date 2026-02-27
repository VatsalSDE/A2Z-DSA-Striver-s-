public class checkidenticaltrees {

    public static boolean checkidentical(Node root1, Node root2){
        if(root1==null || root2==null){
            return(root1==root2);
        }

        return (root1.data == root2.data) && checkidentical(root1.left, root2.left) && checkidentical(root1.right, root2.right);
    }
    public static void main(String[] args) {
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);

        Node root2=new Node(1);
        root2.left=new Node(2);
        root2.right=new Node(3);

        boolean result=checkidentical(root1, root2);
        System.out.println(result);
    }
}
