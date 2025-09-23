import java.util.Arrays;

public class checkifarrayissorted {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int n=arr.length;

        int count=0;

        boolean flag=true;
        for(int i=0;i<n;i++){
            if(arr[i] > arr[(i+1)%n]){
                count++;
            }
            if(count>1){
                flag=false;
                break;
            }
        }
        if(flag==false){
            System.out.println("The array is not sorted");
        }
        else{
            System.out.println("The array is sorted");
        }
    }
}
