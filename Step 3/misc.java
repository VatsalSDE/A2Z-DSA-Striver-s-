import java.util.HashMap;

public class misc {

  private static void swap(int[] arr , int i , int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
  public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        // now this is the extended of the subarray probelm so here we need to print the subarray also that gave us the maximum sum
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        int sum=0;

        int start=0;
        int end=0;

        for(int i=0;i<n;i++){
          sum+=arr[i];

          if(sum>maxsum){
            maxsum=sum;
            end=i;
          }
          if(sum<0){
            sum=0;
            start=i+1;
          }
        }
        System.out.println("The maximum subarray sum is "+maxsum);
        System.out.println("The subarray is ");
        for(int i=start;i<=end;i++){
          System.out.print(arr[i]+" ");
        }
  }
}