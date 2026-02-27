public class finddimaeteroftree {

    public static int maxi=0;
    // public static int maximumdep(Node root){
    //     if(root==null){
    //         return 0;
    //     }

    //     int left=maximumdep(root.left);
    //     int right=maximumdep(root.right);

    //     return 1+ Math.max(left, right);
    // }

    // public static int brutediamet(Node root){
    //     if(root==null){
    //         return 0;
    //     }

    //     int left=maximumdep(root.left);
    //     int right=maximumdep(root.right);

    //     maxi=Math.max(maxi,left+right);
    //     brutediamet(root.left);   
    //     brutediamet(root.right);

    //     return maxi;
    // }
    public static int optimaldiameter(Node root){
        if(root == null){
            return 0;
        }

        int left=optimaldiameter(root.left);
        int right=optimaldiameter(root.right);
        maxi=Math.max(maxi, left+right);

        return 1+Math.max(left, right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        // int result=brutediamet(root);
        // System.out.println(result);

        optimaldiameter(root);
        System.out.println(maxi);
    }
}
