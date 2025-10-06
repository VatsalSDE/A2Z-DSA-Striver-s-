public class removerightmost {
    private static int removerig(int n){
        return n & n-1;
    }
    public static void main(String[] args) {
        int n = 84;
        System.out.println(removerig(n));
    }
}
