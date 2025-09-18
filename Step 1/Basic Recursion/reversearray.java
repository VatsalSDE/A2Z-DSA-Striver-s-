import java.util.Scanner;

public class reversearray {
    private static void reverse(int[] arr , int start , int end){
        if(start>=end){
            return;
        }
        // swap
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        reverse(arr, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        reverse(arr,0,n-1); // function calling

        System.out.println("The reversed array is ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
