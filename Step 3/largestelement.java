public class largestelement {
    
    // bruteforce approach 
    public static void main(String[] args) {
        int[] arr={12,24,9,8,20,1,10};
        int n=arr.length;

        int largest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                largest=arr[i];
            }
        }

        System.out.println("The largest element in the array is "+largest);
    }
}
