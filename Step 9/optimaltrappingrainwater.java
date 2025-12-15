public class optimaltrappingrainwater {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        int n=arr.length;

        int left=0;
        int right=n-1;

        int leftmax=0;
        int rightmax=0;

        int total=0;

        while(left<right){
            if(arr[left]<arr[right]){
                if(arr[left]>=leftmax){
                    leftmax=arr[left];
                }
                else{
                    total+=leftmax-arr[left];
                }
                left++;
            }
            else{
                if(arr[right]>=rightmax){
                    rightmax=arr[right];
                }
                else{
                    total+=rightmax-arr[right];
                }
                right--;
            }
        }
        System.out.println("The total trapped rain water is "+total);
    }
}