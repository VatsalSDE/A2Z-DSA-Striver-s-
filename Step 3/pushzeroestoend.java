public class pushzeroestoend {
    public static void main(String[] args) {
        int[] arr = {1,0,4,0,2,-40,10,0,5};
        int n=arr.length;
        // pushing the zeroes to end 
        // using the two pointers approach 
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                // swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                j++;
            }
        }
        System.out.println("The array after pushing the zeroes to the end is ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}