import java.util.Arrays;

public class smallestDivisor {

    public static int maxi(int[] arr){
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;

        Arrays.sort(arr);

        for(int i=n-1;i>=0;i--){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
            else{
                break;
            }
        }
        return maxi;
    }

    public static int countof(int[] arr , int divi){
        int total=0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            total+=Math.ceil((double)(arr[i])/(double)(divi));
        }
        return total;
    }
    public static int binaryser(int[] arr , int t){
        int n = arr.length;

        int low=1;
        int high=maxi(arr);

        int mid=0;
        int divi=0;
        while(low<=high){
            mid=(high-low)/2+low;

            if(countof(arr, mid)<=t){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int threshhold = 6;

        System.out.println(binaryser(arr, threshhold));
    }
}
