public class romanToInteger {

   static int getvalue(char c ){
        switch(c){
            case 'I':
            return 1;

            case 'V':
            return 5;

            case 'X':
            return 10;

            case 'L':
            return 50;

            case 'C':
            return 100;

            case 'D':
            return 500;

            case 'M':
            return 1000;

            default:
            return -1;
        }
    }
    public static void main(String[] args) {
        String s = "MCMXCIV";

        int n=s.length();
        int sum=0;

        for(int i=0;i<n;i++){
            if(i+1<n && getvalue(s.charAt(i+1)) > getvalue(s.charAt(i))){
                sum-=getvalue(s.charAt(i));
            }
            else{
                sum+=getvalue(s.charAt(i));
            }
        }
        System.out.println("The final output is the ");
        System.out.println(sum);
        
    }
}
