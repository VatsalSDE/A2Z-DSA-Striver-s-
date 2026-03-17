public class atoi {

    static int atoisolution(String s){
        if(s.isEmpty()){
            return 0;
        }

        int n=s.length();
        int i=0; // for traversal
        long num=0; // this is our actual answer
        int sign =1; // for positive or negative

        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            sign=1;
            i++;
        }

        if(i>=n || !Character.isDigit(s.charAt(i))){
            return 0;
        }

        while(i<n && Character.isDigit(s.charAt(i))){
            num=num*10 + (s.charAt(i) - '0');
            
            // check if passes the 32 bit int limit
            if(num*sign > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            else if(num*sign < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) num * sign;
    }
    public static void main(String[] args) {
        String s ="   -042";
        s=s.trim();

        System.out.println("The character to number for the given string is ");
        System.out.println(atoisolution(s));
    }
}
