public class sqrtofnumber {

    public static int findsqrt(int x){
        
        int low=1;
        int high=x;

        if(x<=1){
            return x;
        }

        int mid=0;

        while(low<=high){
            mid=(high-low)/2+low;
            
            if(mid==x/mid){
                return mid;
            }

            if(mid>x/mid){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return high;
    }
    public static void main(String[] args) {

        int x =28;

        System.out.println(findsqrt(x));
    }
}
