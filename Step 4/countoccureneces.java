public class countoccureneces {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 2, 3};
        int n=arr.length;

        int low=0;
        int high=n-1;

        int target=2;

        int mid=0;

         int first=-1;
        while(low<=high){
            mid=(high-low)/2+low;

            if(arr[mid] == target){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid] > target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        low=0;
        high=n-1;
        int last=-1;
        while(low<=high){
            mid=(high-low)/2+low;

            if(arr[mid] == target){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid] > target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        int count=last-first+1;

        System.out.println(count);
    }
}
