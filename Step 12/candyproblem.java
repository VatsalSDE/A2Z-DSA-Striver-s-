public class candyproblem {

    private static int brutecandy(int[] ratings){
        int n=ratings.length;

        int[] left = new int[n];
        int[] right =new int[n];

        // initializing the both first element as 1 from bth side okk
        left[0]=1;
        right[n-1]=1;

        for(int i=1;i<n;i++){
            if(ratings[i] > ratings[i-1]){
                left[i]=left[i-1]+1;
            }
            else{
                left[i]=1;
            }
        }

        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                right[i]=right[i+1]+1;
            }
            else{
                right[i]=1;
            }
        }

        int[] answer=new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            answer[i]=Math.max(left[i],right[i]);
        }

        for(int i=0;i<n;i++){
            sum+=answer[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] ratings={1,2,2};
    }
}
