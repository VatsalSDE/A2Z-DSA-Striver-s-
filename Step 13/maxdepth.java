public class maxdepth {

    public static int maximumdep(Node root){
        if(root==null){
            return 0;
        }

        int left=maximumdep(root.left);
        int right=maximumdep(root.right);

        return 1+ Math.max(left, right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        int result=maximumdep(root);
        System.out.println(result);
    }
}
