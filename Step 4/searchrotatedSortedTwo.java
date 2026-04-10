public class searchrotatedSortedTwo {

    static boolean rotatedTwoapproach(int[] arr , int x){

        int n=arr.length;
        int low=0;
        int high=n-1;

        int mid=0;

        while(low<=high){
            mid=(high-low)/2+low;

            if(arr[mid]==x){
                return true;
            }

            // now to handle the duplicates 
            if(arr[low] == arr[mid] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            
            // if left part is sorted so like here we have to search beyond okk so yess
            if(arr[low] <= arr[mid]){
                
                // no check if the like target is in the range or not okk
                if(arr[low]<=x && x<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{ // right part is sorted okk so yess like so keep going on noww 
                if(x > arr[mid] && x<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target=0;
        System.out.println(rotatedTwoapproach(arr, target));
    }
}
