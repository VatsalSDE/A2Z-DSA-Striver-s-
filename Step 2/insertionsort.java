// Insertion Sort: Take each element and insert it in correct position in sorted portion
public class insertionsort {
    public static void main(String[] args) {
        int[] arr={21,23,34,10,11,20,1,2,20};
        int n=arr.length;

        // Outer loop: consider each element starting from index 1
        for(int i=0;i<n-1;i++){
           // Inner loop: shift current element to its correct position in sorted portion
           for(int j=i+1;j>0;j--){
            if(arr[j]<arr[j-1]){ // If current element is smaller, swap
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
            else break; // Found correct position, stop shifting
           } 
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
