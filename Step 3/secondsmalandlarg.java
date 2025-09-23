public class secondsmalandlarg {
    public static void main(String[] args) {
        int[] arr={12,24,9,8,20,1,10};
        int n=arr.length;

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                largest=arr[i];
            }
            if(arr[i] < smallest){
                smallest=arr[i];
            }
        }
        System.out.println("The smallest element is "+smallest+" and the largest element is "+largest);
        int secondsmallest=Integer.MAX_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i] != smallest && arr[i]<secondsmallest){
                secondsmallest=arr[i];
            }
            if(arr[i] != largest && arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        System.out.println("The second smallest element is "+secondsmallest+" and the second largest element is "+secondlargest);
    }
}
