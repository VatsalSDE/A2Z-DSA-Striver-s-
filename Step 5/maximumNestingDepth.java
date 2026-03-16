public class maximumNestingDepth {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";

        int n=s.length();

        int count=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else if(s.charAt(i)==')'){
                max=Math.max(max, count);
                count--;
            }
            else{
                continue;
            }
        }
        System.out.println("The maximum nesting depth is "+max);
    }
}
