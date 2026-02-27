public class checkbalancedbinarytree {

    public static int maximumdep(Node root){
        if(root==null){
            return 0;
        }

        int left=maximumdep(root.left);
        int right=maximumdep(root.right);

        return 1+ Math.max(left, right);
    }

    public static boolean brutebalancedbinary(Node root){
        if(root==null){
            return true;
        }

        int left=maximumdep(root.left);
        int right=maximumdep(root.right);

        if(Math.abs(left-right)>1) return false;

        return brutebalancedbinary(root.left) && brutebalancedbinary(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        boolean result=brutebalancedbinary(root);
        System.out.println(result);
    }
}
