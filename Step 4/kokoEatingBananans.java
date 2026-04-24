import java.util.Arrays;

public class kokoEatingBananans {

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
    public static int minEatingSpeed(int[] arr , int h){
        int max=maxi(arr);

        int low=1;
        int high=max;
        int mid=0;

        while(low<=high){
            mid=(high-low)/2+low;

            int totalhours=counthour(arr,mid);

            if(totalhours<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int counthour(int[] arr , int mid){
        int totalhours=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            totalhours+=Math.ceil((double)(arr[i])/(double) (mid));
        }
        return totalhours;
    }
    public static void main(String[] args) {
        int[] pile={3,6,7,11};
        int hour=8;

        System.out.println(minEatingSpeed(pile, hour));
    }
}
