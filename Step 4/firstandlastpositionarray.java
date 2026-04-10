public class firstandlastpositionarray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target=8;

        int n=arr.length;
        int low=0;
        int high=n-1;
        int mid=0;
        int first=-1;
        while(low<=high){
            mid=(high-low)/2+low;

            if(arr[mid] == target){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid] > target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        low=0;
        high=n-1;
        int last=-1;
        while(low<=high){
            mid=(high-low)/2+low;

            if(arr[mid] == target){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid] > target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        int[] ans=new int[2];

        ans[0]=first;
        ans[1]=last;
        System.out.println("The first and last occurence of the target element is given as ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
