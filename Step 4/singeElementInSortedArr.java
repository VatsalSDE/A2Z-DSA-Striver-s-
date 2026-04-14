public class singeElementInSortedArr {

    public static int findSIngl(int[] arr){
        int n=arr.length;
        // here we will quickly just check 3 quick conditions 
        if(n==1){
            return arr[0];
        }

        if(arr[0] != arr[1]){
            return arr[0];
        }

        if(arr[n-1] != arr[n-2]){
            return arr[n-1];
        }

        int low=1;
        int high=n-2;
        int mid=0;

        while(low<=high){
            mid=(high-low)/2 + low;

            // Check if middle element is the unique one
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }

            // If mid is in the left half (pairing is valid)
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) ||
                (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                // Move to the right half
                low = mid + 1;
            }
            // If mid is in the right half (pairing broken earlier)
            else {
                // Move to the left half
                high = mid - 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};

        System.out.println(findSIngl(arr));
    }
}
