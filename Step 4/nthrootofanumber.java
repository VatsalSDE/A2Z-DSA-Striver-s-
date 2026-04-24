public class nthrootofanumber {

    public static int power(int exp , int base , int limit){
        int result=1;

        for(int i=0;i<exp;i++){
            result*=base;
            if(result>limit){
                return result;
            }
        }
        return result;
    }

    public static int nthRoot(int n, int m) {
        int low=1;
        int high=m;

        int mid =0;

        while(low<=high){
            mid=(high-low)/2 + low;

            int value=power(n,mid,m);
            if(value==m){
                return mid;
            }

            if (value>m) {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int m=27;
        int nth=4;

        System.out.println(nthRoot(nth, m));
    }
}
