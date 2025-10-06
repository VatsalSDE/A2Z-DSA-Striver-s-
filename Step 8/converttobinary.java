public class converttobinary {

    private static String reverse(String s){
        String rev="";

        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }
    private static String convert(int n){
        String s = "";

        while(n>0){
            if(n%2==1) {
                s+="1";
            }
            else {
                s+="0";
            }
            n=n/2;
        }
        return reverse(s);
    }
    public static void main(String[] args) {
        int n=13;

        String ans = convert(n);
        System.out.println("The binary of the given number is "+ans);
    }
}
