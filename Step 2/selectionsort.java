public class selectionsort {
    public static void main(String[] args) {
        int[] arr={21,23,34,10,11,20,1,2,20};
        int n=arr.length;

        

        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int minindex=-1;
            
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
