public class sortcolours {

    private static void swap(int[] arr , int x , int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,2,1,0,1,0,0,2,1,1,0,0};
        int n=arr.length;

        int low=0;
        int mid=0;
        int high=n-1;

        for(int i=0;i<n;i++){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }

        System.out.println("The array after sorting is ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
