public class minimumdaysMbouquet {

    public static int[]  maxandmin(int[] arr){
        int n=arr.length;

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        int [] ans = new int[2];

        for(int i=0;i<n;i++){
            max=Math.max(max, arr[i]);
            min=Math.min(min, arr[i]);
        }
        
        ans[0]=min;
        ans[1]=max;

        return ans;
}

    public static int binaryse(int[] arr,int k , int m){

        if(arr.length < m*k){
            return-1;
        }

        int [] lh = maxandmin(arr);

        int low=lh[0];
        int high=lh[1];

        int mid=0;

        int day=-1;

        while(low<=high){
            mid=(high-low)/2 + low;

            if(countday(arr, mid, k , m)){
                day=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return day;
    }

    public static boolean countday(int[] arr , int day , int k , int m){
        int n=arr.length;
        
        int countk=0;
        int countbouqu=0;

        for(int i=0;i<n;i++){
            if(arr[i]<=day){
                countk++;
                if(countk==k){
                    countbouqu++;
                    countk=0;
                }
            }
            else{
                countk=0;
            }
        }

        return countbouqu>=m;
    }
    public static void main(String[] args) {
        int[] arr= {7,7,7,7,13,11,12,7};
        int ans=binaryse(arr, 3, 2);

        System.out.println("The no of days required are : "+ans);
    }
}
