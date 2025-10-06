// Bubble Sort: Compare adjacent elements, swap if wrong order, repeat till sorted
public class bubblesort {
    public static void main(String[] args) {
        int[] arr={21,23,34,10,11,20,1,2,20};
        int n=arr.length;

        // Outer loop: n-1 passes to ensure largest elements bubble to end
        for(int i=0;i<n-1;i++){
            boolean flag=true; // Optimization: detect if array is already sorted
            // Inner loop: compare adjacent elements, largest bubbles to end
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag=false; // Swap occurred, so not sorted yet
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(flag) break; // No swaps made, array is sorted
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
