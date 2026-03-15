public class longestcommonprefix {

    private static String common(String s , String t){
        int n=Math.min(s.length(), t.length());

        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==t.charAt(i)){
                res.append(s.charAt(i));
            }
            else{
                break;
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String[] str={"flower", "flour" ,"floor"};

        int n=str.length;

        String res=str[0];

        for(int i=1;i<n;i++){
            res=common(res,str[i]);
        }
        System.out.println("The longest common prefix string is the ");
        System.out.println(res);
    }
}
