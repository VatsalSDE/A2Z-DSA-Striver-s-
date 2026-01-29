import java.util.Arrays;

public class assigncookies {
    public static void main(String[] args) {
        int[] greed = {1,3,3,4,5};
        int[] size =  {1,2,2,3,4};

        int left=0;
        int right=0;

        Arrays.sort(greed);
        Arrays.sort(size);

        while(left<greed.length && right<size.length){
            if(size[left]>=greed[right]){
                left++;
                right++;
            }
            else{
                left++;
            }
        }
        System.out.println(right);
    }
}