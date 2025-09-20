public class bubblesort {
    public static void main(String[] args) {
        int[] arr={21,23,34,10,11,20,1,2,20};
        int n=arr.length;


        for(int i=0;i<n-1;i++){
            boolean flag=true;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag=false;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(flag) break;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
