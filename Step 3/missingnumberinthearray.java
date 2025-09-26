public class missingnumberinthearray {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,5};

        int n=arr.length;

        //here the bruteforce is that we can find the missing 
        // by subtracting the sum of the elements of the array form the sum of til nnatural numbers 
        // int sumofn = n*(n+1)/2;

        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum+=arr[i];
        // }
        // System.out.println("The missing element is "+(sumofn-sum));

        // optimized by using the XOR ^ operator
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }

        for(int i=1;i<=n;i++){
            xor=xor^i;
        }

        System.out.println("The missing element is "+xor);
    }
}
