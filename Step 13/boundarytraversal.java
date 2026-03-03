import java.util.ArrayList;

public class boundarytraversal {

    public static boolean checkleaf(Node root){
        return (root.left==null && root.right==null);
    }

    public static void leftpart(Node root,ArrayList<Integer> ans){
        Node curr=root.left;

        while(curr!=null){
            if(!checkleaf(curr)) ans.add(curr.data);
            if(curr.left!=null){
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }
    }

    public static void addleafpart(Node root , ArrayList<Integer> ans){
        // so here we will perform the pre order traversal okk
        if(checkleaf(root)){
            ans.add(root.data);
            return;
        }
        if(root.left!=null) addleafpart(root.left, ans);
        if(root.right!=null) addleafpart(root.right, ans);
    }

    public static void addrightpart(Node root , ArrayList<Integer> ans){
        Node curr=root.right;
        ArrayList<Integer> temp=new ArrayList<>();

        while(curr!=null){
            if(!checkleaf(curr)) temp.add(curr.data);
            if(curr.right!=null){
                curr=curr.right;
            }
            else{
                curr=curr.left;
            }
        }
        for(int i=temp.size()-1;i>=0;i--){
            ans.add(temp.get(i));
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);

        ArrayList<Integer> ans=new ArrayList<>();

        if(root==null){
            System.out.println(ans);
            return;
        }

        if(!checkleaf(root))  // prevent duplicate
            ans.add(root.data);

        // left part
        leftpart(root, ans);

        // leaf part
        addleafpart(root, ans);

        // right part
        addrightpart(root, ans);

        System.out.println(ans);
    }
}