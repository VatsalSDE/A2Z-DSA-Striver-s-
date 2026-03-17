public class upperBound {
    public static void main(String[] args) {
        int[] arr={2, 3, 7, 10, 11, 11, 25};
        int n=arr.length;

        int low=0;
        int high=n-1;
        
        int ans=n;
        int mid=0;
        int target=9;
        while(low<=high){
            mid=(high-low)/2 + low;
            
            if(arr[mid]>=target){
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("The upper bound is "+ans);
    }
}
