// Merge Sort: Divide & Conquer - Split array, recursively sort halves, merge sorted arrays
public class mergesort {

    // Merge two sorted arrays into one sorted array using 3 pointers
    private static int[] merge(int[] a , int[] b, int[] arr){
        // taking three pointers for the three arrays 
        int i=0; // Pointer for array a
        int j=0; // Pointer for array b
        int k=0; // Pointer for merged array

        int n=a.length;
        int m=b.length;

        // Compare elements from both arrays and merge in sorted order
        while(i<n && j<m){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                i++;
                k++;
            }
            else{
                arr[k]=b[j];
                j++;
                k++;
            }
        }

        // Add remaining elements from either array
        if(i==n){
            while(j<m){
                arr[k]=b[j];
                j++;
                k++;
            }
        }
        else{
            while(i<n){
                arr[k]=a[i];
                i++;
                k++;
            }
        }

        return arr;
    }

    // Main merge sort function: recursively divide array into halves
    private static void mergesortarray(int[] arr){
        int n=arr.length;
        if(n==1) return; // Base case: single element

        // Divide array into two halves
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];

        // Copy elements to left and right subarrays
        for(int i=0 ; i<n/2;i++) a[i]=arr[i];

        for(int i=0;i<n-n/2;i++) b[i]=arr[i+n/2];

        // Recursively sort both halves
        mergesortarray(a);
        mergesortarray(b);

        // Merge the sorted halves back into original array
        merge(a,b,arr);

        a=null ; b=null; // Clean up memory
    }
    public static void main(String[] args) {
        int[] arr={21,23,34,10,11,20,1,2,20};
        
        System.out.println("The array befor merge is ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        mergesortarray(arr);
        System.out.println("The array after merge is ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
