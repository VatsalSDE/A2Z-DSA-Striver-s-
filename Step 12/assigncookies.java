import java.util.Arrays;

public class assigncookies {
    public static void main(String[] args) {
        int[] greed = {1,2,3};
        int[] size =  {1,1};

        int left=0;
        int right=0;

        Arrays.sort(greed);
        Arrays.sort(size);

        while(left<greed.length && right<size.length){
            if(size[right]>=greed[left]){
                left++;
            }
            right++;
        }
        System.out.println(left);
    }
}