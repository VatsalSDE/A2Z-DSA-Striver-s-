public class algo_quick_sort {
    public static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
    
    public static void swap(int[] arr, int pivotidx , int correctidx){
        int temp=arr[pivotidx];
        arr[pivotidx]=arr[correctidx];
        arr[correctidx]=temp;
    }

    public static int partitionidx(int[] arr , int low , int high){
        int pivot=arr[low] ;
        int pivotidx=low;

        int smallercount=0;

        for(int i=low+1;i<=high;i++){
            if(arr[i]<=pivot) smallercount++;
        }

        int correctidx=smallercount+pivotidx; // this is the correct index of the pivot element where we have to shift it
        swap(arr, pivotidx, correctidx);

        int i=low;
        int j=high;

        while(i<correctidx && j>correctidx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;

            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr, i, j);
            }
        }
        return correctidx;

    }

    public static void quicksort(int[] arr , int low , int high){
        if(low>=high) return;

        // here pivot element is arr[low] so put it at right position
        // and in left part me <=pivot 

        int idx=partitionidx(arr,low,high);
        quicksort(arr, low, idx-1);
        quicksort(arr, idx+1, high);
        
    }
    public static void main(String[] args) {
        int[] arr={8,4,1,2,9,6,5};
        int n=arr.length;

        print(arr);
        System.out.println();
        int low=0 , high=n-1;

        quicksort(arr,low,high);
        print(arr);

    }
}
