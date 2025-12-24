public class maxsubarrpart2 {
    public static void main(String[] args) {
        int[] arr={1,2,-4,4};
        int n=arr.length;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;

        int start=0;
        int ansstart=0;
        int ansend=0;

        for(int i=0;i<n;i++){
            if(sum==0) start=i;

            sum+=arr[i];

            if(sum>maxsum){
                maxsum=sum;
                ansstart=start;
                ansend=i;
            }

            if(sum<0){
                sum=0;
            }
        }

        for(int i=ansstart ; i<=ansend;i++){
            System.out.print(arr[i] + " ");
        }
    }
}