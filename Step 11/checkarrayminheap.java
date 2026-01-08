public class checkarrayminheap {
    public static void main(String[] args) {
        int[] arr = {10,20,30,25,15};
        int n=arr.length;
        boolean isminheap=true;
        // now we will traverse till the n/2-1 only because after them all are the leaf nodes
        for(int i=0;i<n/2;i++){
            int leftchild=2*i+1;
            int rightchild=2*i+2;
            // this is to check the left child of parent 
            if(leftchild<n && arr[i]>arr[leftchild]){
                isminheap=false;
                break;
            }
            // now we will check the right child of the parent
            if(rightchild<n && arr[i]>arr[rightchild]){
                isminheap=false;
                break;
            }
        }
        if(isminheap){
            System.out.println("The given array is a min heap");
        }
        else{
            System.out.println("The given array is not a min heap");
        }
    }
}