import java.util.Arrays;

public class countnonoverlapinterval {
    public static void main(String[] args) {
        int[][] intervals={{1,2},{2,3},{3,4},{1,3}};
        int n=intervals.length;

        // sort the array in ascending order according to the end point 
        Arrays.sort(intervals,(a,b) -> a[1]-b[1]);

        int count=0;

        int previosend=intervals[0][1];

        for(int i=1;i<n;i++){
            if(intervals[i][0] < previosend){
                count++;
            }
            else{
                previosend=intervals[i][1];
            }
        }
        System.out.println("The minimum number of the intervals that need to be removed are "+count);
    }
}