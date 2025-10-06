// Move Zeros to End: Two-pointer approach - collect non-zeros at start, zeros naturally go to end
public class movexeroestoend {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        int n=arr.length;

        int j=0; // Pointer to track position for next non-zero element

        // Single pass: move all non-zero elements to front
        for(int i=0;i<n;i++){
            if(arr[i]!=0){ // Found non-zero element
                // Swap with position j (maintains relative order of non-zeros)
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++; // Move to next position for non-zero
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
