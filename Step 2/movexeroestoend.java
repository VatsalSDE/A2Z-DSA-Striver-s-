public class movexeroestoend {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        int n=arr.length;

        int j=0;

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
