public class setithbit {
    private static int setithbit(int n , int i){
        return (n|(1<<i));
    }
    public static void main(String[] args) {
        int n=9;
        int i=2;

        System.out.println(setithbit(n,i));
    }
}
