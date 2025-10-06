public class countsetbits {
    // bruteforce 
    private static int cnt(int n){
        int cnt=0;
        while(n>0){
            if(n%2==1){
                cnt++;
            }
            n=n/2;
        }
        // if(n==1) cnt++;
        return cnt;
    }

    // optimized 
    private static int cntopti(int n){
        int cnt=0;

        while(n>0){
            cnt+=n&1;
            n=n>>1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(cntopti(n));
    }
}
