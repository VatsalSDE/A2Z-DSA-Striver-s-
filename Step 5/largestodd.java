public class largestodd {
    public static void main(String[] args) {
        String s = "28734474846";
        int n=s.length();

        for(int i=n-1 ; i>=0 ; i--){
            if((s.charAt(i) % 2) != 0){
                System.out.println(s.substring(0, i+1));
                break;
            }
        }
    }
}
