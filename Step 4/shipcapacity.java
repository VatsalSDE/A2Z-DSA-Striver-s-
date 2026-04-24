public class shipcapacity {

    public static int sum(int[] arr){
        int sum=0;

        int n=arr.length;

        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static int findmax(int[]arr){
        int n= arr.length;

        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            max=Math.max(max, arr[i]);
        }
        return max;
    }

    public static boolean check(int[] arr , int cap , int day){
        int n=arr.length;

        int sum=0;
        int dayc=1;
        for(int i=0;i<n;i++){
            if((sum+arr[i])<=cap){
                sum+=arr[i];
            }
            else{
                dayc++;
                sum=arr[i];
            }
        }
        return dayc<=day;
    }

    public static int binaryse(int[] arr , int day){
        int low=findmax(arr);
        int high=sum(arr);

        int mid =0;

        while(low<=high){
            mid=(high-low)/2+low;

            if(check(arr, mid, day)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        int ans = binaryse(weights, 5);

        System.out.println(ans);
    }
}
