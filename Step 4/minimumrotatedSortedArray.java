public class minimumrotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int n=arr.length;

        int low=0;
        int high=n-1;
        int mid=0;

        int minimum=Integer.MAX_VALUE;

        while(low<=high){
            mid=(high-low)/2+low;

            // this means left part is sorted okk so yess
            if(arr[low] <= arr[mid]) {
                minimum=Math.min(minimum, arr[low]);
                low=mid+1;
            }
            else{ // right part is sorted okk so yess
                minimum=Math.min(minimum, arr[mid]);
                high=mid-1;
            }
        }
        System.out.println("The minimum element in the rotated sorted array is "+minimum);
    }
}
