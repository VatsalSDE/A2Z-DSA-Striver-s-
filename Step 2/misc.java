public class misc {
    public static void main(String[] args) {
        int[] arr = {23,24,45,12,20,5};
        int n=arr.length;

        // implementation of the Insertion sort algorithm     
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        // print the sorted array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
