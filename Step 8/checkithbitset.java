public class checkithbitset {
    // using left shift operator
    private static boolean checkithbit(int n , int i){
        if((n&(i<<1))!=0){
            return true;
        }
        return false;
    }
    //using right shift operator
    private static boolean checkithbitr(int n , int i){
        if(((n>>i)&1)!=0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 13;
        int i = 2;
        
        if(checkithbit(n, i)){
            System.out.println("The ith bit in the number is set ");
        }
        else{
            System.out.println("The ith bit in the number is not set");
        }
    }
}
