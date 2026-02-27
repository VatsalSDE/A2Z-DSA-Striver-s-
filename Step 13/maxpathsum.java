public class maxpathsum {

    public static int maxipathopti(Node root,int[] maxi){

        if(root==null){
            return 0;
        }

        int left=Math.max(0,maxipathopti(root.left,maxi));
        int right=Math.max(0,maxipathopti(root.right,maxi));

        maxi[0]=Math.max(maxi[0],root.data+left+right);
        return root.data+Math.max(left, right);
    }
    public static void main(String[] args) {
            Node root = new Node(10);
            root.left = new Node(2);
            root.right = new Node(10);
            root.left.left = new Node(20);
            root.left.right = new Node(1);
            root.right.right = new Node(-25);
            root.right.right.left = new Node(3);
            root.right.right.right = new Node(4);

            int[] maxi=new int[1];
            maxi[0]=Integer.MIN_VALUE;
            maxipathopti(root, maxi);
            System.out.println(maxi[0]);       
    }
}
