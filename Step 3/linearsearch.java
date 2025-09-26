public class linearsearch {
    public static void main(String[] args) {
        int[] arr= {23,12,45,67,11,90,88};
        int n=arr.length;
        int target =12;

        boolean flag=false;

        for(int i=0;i<n;i++){
            if(arr[i]==target){
                flag=true;
                break;        
            }
        }

        if(flag==false){
            System.out.println("The element is not found ");
        }
        else{
            System.out.println("The element is found");
        }
    } 
}
