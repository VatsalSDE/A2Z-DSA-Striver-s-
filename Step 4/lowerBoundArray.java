public class lowerBoundArray {
    public static void main(String[] args) {
        int[] arr ={3, 4, 6, 7, 9, 12, 16, 17};
        int n=arr.length;

        int low=0;
        int high=n-1;

        int mid=0;

        int x=8;

        int ans=n;
        while(low<=high){
            mid=(high-low)/2+low;

            if(arr[mid]>=x){
                ans=Math.min(ans, mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("The lower bound of the elemnt x is given if found so the index and if not found so n will be returned");
        System.out.println(ans);
    }
}
