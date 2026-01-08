// This is actually the implementation of the MIN HEAP okk sio yaa given below just the name is Binary Heap

public class BinaryHeapintro {

    private int capacity;
    private int size;
    private int[] heap;

    public BinaryHeapintro(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    // Helper Functions for the parent , left and right of the it'th node

    static int parent(int i){
        return (i-1)/2;
    }

    static int left(int i){
        return 2*i+1;
    }

    static int right(int i){
        return 2*i+2;
    }

    // now we will make the insert function okk so go for that 
    public void Insert(int x){
        if(size==capacity){
            System.out.println("Heap is full");
            return;
        }

        // Insert new element at the end 
        heap[size] = x;

        // now we need to store the index to check the heap property
        int k=size;

        // increase the size 
        size++;

        // now check the heap property
        while(k>0 && heap[parent(k)]>heap[k]){
            // swap the elements
            int temp = heap[k];
            heap[k] = heap[parent(k)];
            heap[parent(k)] = temp;

            // move to the parent index
            k = parent(k);
        }
    }


    // Now the heapify method okk
    public  void Heapify(int ind) {
    // Right child
    int ri = right(ind);  
    
    // Left child
    int li = left(ind);  
    
    // Initially assume violated value is minimum
    int smallest = ind;  

    if (li < size && heap[li] < heap[smallest])
      smallest = li;

    if (ri < size && heap[ri] < heap[smallest])
      smallest = ri;

    // If the Minimum among the three nodes is not the parent itself,
    // then swap and call Heapify recursively
    if (smallest != ind) {
      int temp = heap[ind];
      heap[ind] = heap[smallest];
      heap[smallest] = temp;
      Heapify(smallest);
    }
  }
  // now get min function
    public int getMin(){
        if(size==0){
            System.out.println("Heap is empty");
            return -1;
        }
        return heap[0];
    }

    // now extract min function
    public int extractMin(){
        if (size <= 0)
      return Integer.MAX_VALUE;

    if (size == 1) {
      size--;
      return heap[0];
    }

    int mini = heap[0];

    // Copy last Node value to root Node
    heap[0] = heap[size - 1];  

    size--;

    // Call heapify on root node
    Heapify(0);  

    return mini;
    }

    // now the decrease key function so go for it 
    public void Decreasekey(int i,int val){
        heap[i] = val;  

    // Fixing the Min heap
    while (i != 0 && heap[parent(i)] > heap[i]) {
      int temp = heap[parent(i)];
      heap[parent(i)] = heap[i];
      heap[i] = temp;
      i = parent(i);
        }
    }

    // now the delete function so go for it now 
    public void Delete(int i){
        Decreasekey(i, Integer.MIN_VALUE);
        extractMin();
    }

    // now the print method 
    public void printHeap(){
        for(int i=0;i<size;i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryHeapintro h= new BinaryHeapintro(20);
         h.Insert(4);
         h.Insert(1);
         h.Insert(2);
         h.Insert(6);
         h.Insert(7);
         h.Insert(3);
         h.Insert(8);
         h.Insert(5);

         h.printHeap();
    System.out.println("Min value is " + h.getMin());

    h.Insert(-1);
    System.out.println("Min value is " + h.getMin());

    h.Decreasekey(3, -2);
    System.out.println("Min value is " + h.getMin());

    h.extractMin();
    System.out.println("Min value is " + h.getMin());

    h.Delete(0);
    System.out.println("Min value is " + h.getMin());
    }
}
