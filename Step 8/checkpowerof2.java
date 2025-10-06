public class checkpowerof2 {
    private static int chpow(int n){
        return n&n-1;
    }
    public static void main(String[] args) {
        int n = 128;
        
        if(chpow(n)==0){
            System.out.println("Yes the number is power of 2");
        }
        else{
            System.out.println("No the umber is not power of two");
        }
    }
}
