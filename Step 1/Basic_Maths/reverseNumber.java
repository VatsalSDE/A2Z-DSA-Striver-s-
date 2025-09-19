public class reverseNumber {
    public static void main(String[] args) {
        int n=-123;
        int div=0;
        int reverse=0;

        while(n != 0){
            // in this we have to put one more condition for the unsigned integers for the range of 2 raise to 31 integers
            if(reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE /10){
                reverse=0;
                break;
            }
            div=n%10;
            reverse=(reverse*10)+div;
            n=n/10;
        }
        System.out.println(reverse);
    }
}