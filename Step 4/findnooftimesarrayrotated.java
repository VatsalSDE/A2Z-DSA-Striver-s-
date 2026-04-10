public class findnooftimesarrayrotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int n=arr.length;

        int low=0;
        int high=n-1;

        int min=Integer.MAX_VALUE;
        int minIndex=n;
        int mid=0;

        while(low<=high){
            mid=(high-low)/2+low;

            if(arr[low]<=arr[mid]){
                if(arr[low]<min){
                    min=arr[low];
                    minIndex=low;
                }
                low=mid+1;
            }
            else{
                if(arr[mid]<min){
                    min=arr[mid];
                    minIndex=mid;
                }
                high=mid-1;
            }
        }
        System.out.println("The number of times that the array was rotated is "+minIndex);
    }
}
