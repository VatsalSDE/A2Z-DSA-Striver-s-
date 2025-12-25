import java.util.Arrays;

public class longestrepeatingcharacterreplacement {
    public static void main(String[] args) {
        String s = "BAABAABBBAAA";
        int k = 2;
        // int maxlength=0;

        // int n=s.length();
        // naive or bruteforce approach
        // for(int i=0;i<n;i++){
        // int[] hash=new int[26];
        // Arrays.fill(hash, 0);
        // int maxfreq=0;

        // for(int j=i;j<n;j++){
        // hash[s.charAt(j)-'A']++;
        // maxfreq=Math.max(maxfreq, hash[s.charAt(j)-'A']);
        // int changes = (j-i+1)-maxfreq;
        // if(changes<=k){
        // int len=j-i+1;
        // maxlength=Math.max(maxlength, len);
        // }
        // else{
        // break;
        // }
        // }

        // }
        // System.out.println("The length of the longest substring after replacing at
        // most k characters is "+maxlength);

        // optimized appproach
        int left = 0;
        int right = 0;
        int maxfreq = 0;
        int maxlength = 0;
        int n = s.length();
        int[] hash = new int[26];

        while (right < n) {
            hash[s.charAt(right) - 'A']++;
            maxfreq = Math.max(maxfreq, hash[s.charAt(right) - 'A']);
            int changes = (right - left + 1) - maxfreq;
            if (changes <= k) {
                int len = right - left + 1;
                maxlength = Math.max(maxlength, len);
            } else {
                hash[s.charAt(left) - 'A']--;
                left++;
            }
            right++;
        }
        System.out.println("The length of the longest substring after replacing at most k characters is " + maxlength);
    }
}