import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeinterval {

    private static List<List<Integer>> brutappro(int[][] intervals){
        int n=intervals.length;
        int i=0;
        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        while(i<n){
            int start=intervals[i][0];
            int end=intervals[i][1];

            int j=i+1;

            // now we will check all the overlapping intervals and then will do find out the max end and add it to the ansswer arraylist

            while(j<n && intervals[j][0] <=end){
                end=Math.max(end, intervals[j][1]);
                j++;
            }

            // now will add the array list
            ans.add(Arrays.asList(start,end));

            // now move the i to the next non overlaping interval
            i=j;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] intervals={{1,3},{8,10},{2,6},{9,9},{15,18}};

        List<List<Integer>> ans = brutappro(intervals);
        System.out.println("The answer is ");
        System.out.println(ans);
    }
}
