public class insertionsort {
    public static void main(String[] args) {
        int[] arr={21,23,34,10,11,20,1,2,20};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
           for(int j=i+1;j>0;j--){
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
            else break;
           } 
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
