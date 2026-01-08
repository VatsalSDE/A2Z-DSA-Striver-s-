public class numberevendigits {
    // this is leetcode 1295 
    // for extra practice 
    private static boolean checkeven(int n){
        int cnt=0;
        while(n!=0){
            cnt++;
            n=n/10;
        }
        return cnt%2==0;
    }
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int n=arr.length;

        int count=0;

        for(int i=0;i<n;i++){
            if(checkeven(arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
