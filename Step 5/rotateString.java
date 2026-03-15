public class rotateString {
    private static boolean rotateCheck(String s , String goal){
        if(s.length() != goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal="bcdea";

        System.out.println(rotateCheck(s, goal));
    }
}