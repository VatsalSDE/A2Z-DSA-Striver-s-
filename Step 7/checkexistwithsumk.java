public class checkexistwithsumk {
    private static boolean checksubsequence(int ind , int[] arr , int s , int sum , int n){
        if(ind==n){
            return s==sum;
        }
        // now the take portion
        s+=arr[ind];
        if(checksubsequence(ind+1,arr,s,sum,n) == true) return true;
        s-=arr[ind];
        // now the not take portion
        if(checksubsequence(ind+1,arr,s,sum,n) == true) return true;
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int n=arr.length;
        int sum=5;
        boolean flag=false;
        if(checksubsequence(0,arr,0,sum,n) == true){
            System.out.println("The subsequence with the given sum is present");
        }
        else{
            System.out.println("The subsequence with the given sum is not present");
        }
    }
}
