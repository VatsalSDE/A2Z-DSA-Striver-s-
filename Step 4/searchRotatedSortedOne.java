public class searchRotatedSortedOne {

    static int rotatedone(int[] arr , int x){

        int n=arr.length;
        int low=0;
        int high=n-1;

        int mid=0;

        while(low<=high){
            mid=(high-low)/2+low;

            if(arr[mid]==x){
                return mid;
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
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        int target=0;

        int n=arr.length;
        int ans=rotatedone(arr, target);
        System.out.println("The index of the target element is "+ans);
    }
}
