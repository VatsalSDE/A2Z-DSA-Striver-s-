public class misc {
    public static void main(String[] args) {
        int[] arr = {23,24,45,12,20,5};
        int n=arr.length;

        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int mindex=-1;

            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindex=j;
                }
            }

            int temp = arr[i];
            arr[i]=min;
            arr[mindex]=temp;
        }

        for (int i : arr) {
            System.out.print( i + " ");
        }
    }
}
