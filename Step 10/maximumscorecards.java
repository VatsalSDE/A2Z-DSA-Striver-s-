public class maximumscorecards {
    public static void main(String[] args) {
        int[] arr={5,4,1,8,7,1,3};
        int n=arr.length;
        int k=3;
        // Brute Force Approach
        // int maxscore=0;
        // for(int i=0;i<=k;i++){
        //     int tempscore=0;

        //     //now add from front 
        //     for(int j=0;j<i;j++){
        //         tempscore+=arr[j];
        //     }

        //     // now add from back
        //     for(int j=0;j<k-i;j++){
        //         tempscore+=arr[n-j-1];
        //     }
        //     maxscore=Math.max(tempscore,maxscore);
        // }
        
        // optimal
        int leftsum=0;
        int rightsum=0;
        int maxsum=0;
        // first will calculate all from the left okk so let's go for that 
        for(int i=0;i<=k-1;i++){
            leftsum+=arr[i];
        }
        maxsum=leftsum;
        // now will calculate from the right side and the thinking will be like add one card from right so remove one from the left
        int rindex=n-1;
        for(int i=k-1;i>=0;i--){
            leftsum-=arr[i];
            rightsum+=arr[rindex];
            rindex-=1;

            maxsum=Math.max(maxsum, leftsum+rightsum);
        }
        System.out.println(maxsum);
    }
}