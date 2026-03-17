public class longestpalindromicSubstring {

    static boolean ispalindrom(String s){
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "babad";

        int n=s.length();

        // positions of the longest substring 
        int start=0;
        int end=0;

        int maxlength=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(ispalindrom(s.substring(i,j+1))){
                    if((j-i+1)>maxlength){
                        maxlength=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        System.out.println(s.substring(start,end+1));
    }
}
