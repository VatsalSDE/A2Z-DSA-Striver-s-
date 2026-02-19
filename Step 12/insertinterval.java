public class insertinterval {
    public static void main(String[] args) {
        int[][] intervals={{1,3},{6,9}};
        int [] newinterval={2,5};

        int n=intervals.length;

        int[][] resultant=new int[n+1][2];

        int i=0;
        int idx=0;

        // now first taking out the left section that is where the interval not overlapping okk

        while(i<n && intervals[i][1]<newinterval[0]){
            resultant[idx++]=intervals[i];
            i++;
        }
        // now merging the overlapping intervals
        while (i<n && intervals[i][0] <= newinterval[1]) {
            newinterval[0]=Math.min(newinterval[0], intervals[i][0]);
            newinterval[1]=Math.max(newinterval[1], intervals[i][1]);
            i++;
        }
        resultant[idx++]=newinterval;

        // now we will add the remining right most section okk so yaa now 
        while(i<n){
            resultant[idx++]=intervals[i];
            i++;
        }

        int[][] ans = new int[idx][2];
        for (int k = 0; k < idx; k++) {
            ans[k] = resultant[k];
        }
        // printing the ans array
        for(int k=0;k<ans.length;k++){
            System.out.println("["+ans[k][0]+","+ans[k][1]+"]");
        }
    }
}
