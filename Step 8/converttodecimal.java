public class converttodecimal {
    private static int convertde(String s){
        int n=s.length();
        int sum=0;
        int power=0;

        for(int i=n-1;i>=0;i--){
            int bit = s.charAt(i) - '0'; // converting the char to bit     
            sum+=bit*Math.pow(2, power);
            power++;  
        }
        return sum;
    }

    // another method to solve this 
    private static int conv(String s){
        int n=s.length();
        int power=1;
        int sum=0;
                
        for(int i=n-1 ; i>=0; i--){
            if(s.charAt(i)=='1'){
                sum+=power;
            }
            power=power*2;
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "1101";
        int ans = convertde(s);
        System.out.println("The decimal for the given binary is "+ans);
    }
}