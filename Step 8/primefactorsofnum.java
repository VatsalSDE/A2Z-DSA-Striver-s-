public class primefactorsofnum {

    private static boolean checkprime(int n){
        if(n<=1) return false;
        int count=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) count++;
            if(count>0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n= 60;
        for(int i=1;i<=n;i++){
            if(n%i==0 && checkprime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
