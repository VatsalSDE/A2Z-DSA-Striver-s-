public class minimumwindowsubsequence {

     private static String optimalminWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = -1;

        int i = 0;

        while (i < n) {
            int j = 0;

            // Forward scan to match t
            while (i < n) {
                if (s.charAt(i) == t.charAt(j)) {
                    j++;
                }
                if (j == m) break;
                i++;
            }

            if (j != m) break;

            int end = i;
            j--;

            // Backward scan to minimize
            while (i >= 0) {
                if (s.charAt(i) == t.charAt(j)) {
                    j--;
                }
                if (j < 0) break;
                i--;
            }

            int currLen = end - i + 1;
            if (currLen < minLen) {
                minLen = currLen;
                start = i;
            }

            i = i + 1;
        }

        return start == -1 ? "" : s.substring(start, start + minLen);
    }

    private static boolean issubsequence(String s , String t){
        int i=0; 
        int j=0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
            i++;
        }
        return j==t.length();
    }

    private static String bruteforceminmumwindosubseq(String s , String t){
        int n=s.length();

        String ans="";
        int minlen=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String subtr=s.substring(i, j+1);
                if(issubsequence(subtr,t)){
                    int len=j-i+1;
                    if(len<minlen){
                        minlen=len;
                        ans=subtr;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abcdebdde";
        String t = "bde";

        // String result = bruteforceminmumwindosubseq(s, t);
        // System.out.println(result);

        String result=optimalminWindow(s, t);
        System.out.println(result);
    }
}
