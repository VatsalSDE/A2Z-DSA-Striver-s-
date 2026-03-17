public class sumofbeautyofAllstrings {

    static int beauty(String s){
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;

        for(int f : freq){
            if(f > 0){
                maxFreq = Math.max(maxFreq, f);
                minFreq = Math.min(minFreq, f);
            }
        }
        return maxFreq - minFreq;
    }
    public static void main(String[] args) {
        String s = "aabcb";
        int n=s.length();

        int sum=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum+=beauty(s.substring(i, j+1));
            }
        }
        System.out.println(sum);
    }
}