public class peakElement {

    private static int peakEle(int[] arr){

        int n=arr.length;

        // edge cases 

        if(n==1){
            return 0;
        }

        if(arr[0] > arr[1]){
            return 0;
        }

        if(arr[n-1] > arr[n-2]){
            return n-1;
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,5,1};
        int n=arr.length;

        System.out.println("The peak element index in the array is given below : ");
        System.out.println(peakEle(arr));
    }
}
