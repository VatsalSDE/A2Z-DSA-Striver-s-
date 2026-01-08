public class minheaptomaxheap {
    private static void Heapifymax(int[] arr , int n , int i){
        int largest=i;
        int right = 2*i+1;
        int left = 2*i+2;

        if(left<n && arr[left]>arr[largest]) largest=left;
        if(right<n && arr[right]>arr[largest]) largest=right;

        // now traverse and call recursively till the current node is at the proper structure 
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            Heapifymax(arr,n,largest);
        }
    }
    public static void main(String[] args) {
        int[] minheap={1, 3, 5, 7, 9, 6};
        int n=minheap.length;

        // now we need to traverse from n/2-1 to 0 because after the n/2 are  the leaf nodes and they don't affect te structure of the max heap and all so ya go with it now okk so let's go for that 
        for(int i=n/2-1;i>=0;i--){
            Heapifymax(minheap,n,i);
        }
        // now print the max heap
        for(int i=0;i<n;i++){
            System.out.print(minheap[i]+" ");
        }
    }
}
