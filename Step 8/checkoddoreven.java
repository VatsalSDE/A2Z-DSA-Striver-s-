public class checkoddoreven {
    private static boolean ch(int n){
        return (n&1)==1;
    }
    public static void main(String[] args) {
        int n=16;

        if(ch(n)){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even");
        }
    }
}
