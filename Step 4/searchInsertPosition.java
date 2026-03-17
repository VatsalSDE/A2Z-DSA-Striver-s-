public class searchInsertPosition {
    public static void main(String[] args) {
        int[] arr ={1,3,5,6};

        int target=5;

        int n=arr.length;
        int low=0;
        int high=n-1;

        int mid=0;

        int ans=-1;

        while(low<=high){
            mid=(high-low)/2+low;

            if(arr[mid] >= target){
                ans=Math.min(mid, ans);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("The insert position is ");
        System.out.println(ans);
    }
}
