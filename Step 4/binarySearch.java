public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {3,4,6,6,6,6,6,7,9,12,16,17};
        int n=arr.length;

        // so here we are implementing the binary search okk but like now in th e gfg we have to return the first occurence only so yeah need to think like that only so yeah now going for it 

        int low=0;
        int high=n-1;

        int mid=0;
        int ans=0; 
        int target=6;

        while(low<=high){
            mid=(high-low)/2 + low;

            if(arr[mid] == target){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid] > target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("The index of the target element is the "+ans);
    }
}