public class minimumflips {
    private static int flip(int start , int goal){
        int ans = start ^ goal;

        // now count the no of set bits in the answer
        int count =0;

        while(ans>0)
        {
            count+=ans&1;
            ans=ans>>1;
        }
        return count;
        }
    public static void main(String[] args) {
        int start = 10;
        int end = 7;

        int ans =flip(start , end);
        System.out.println(ans);
    }
}
