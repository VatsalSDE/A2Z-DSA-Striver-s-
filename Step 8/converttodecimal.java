public class converttodecimal {
    private static int convertde(String s){
        int n=s.length();
        int sum=0;
        int power=0;

        for(int i=s.length()-1;i>=0;i--){

            int bit = s.charAt(i) - '0'; // converting the char to bit     
            sum+=bit*Math.pow(2, power);
            power++;

        }

        return sum;
    }
    public static void main(String[] args) {
        String s = "1101";
        int ans = convertde(s);
        System.out.println("The decimal for the given binary is "+ans);
    }
}
