import java.util.ArrayList;
import java.util.Arrays;

public class nmeetings {

    static class Meeting {
        int start;
        int end;
        int pos;

        Meeting(int start, int end, int pos) {
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }

    public static void main(String[] args) {
        int[] start = { 0, 3, 1, 5, 5, 8 };
        int[] end = { 5, 4, 2, 9, 7, 9 };

        int n = start.length;

        Meeting[] meetings = new Meeting[n];

        for (int i = 0; i < n; i++) {
            meetings[i] = new Meeting(start[i], end[i], i + 1);
        }

        // now sorting the array according to the end position only okk so let's go for that 
        Arrays.sort(meetings,(a,b) -> a.end-b.end);

        ArrayList<Integer> ans = new ArrayList<>();

        int freetime=meetings[0].end;
        ans.add(meetings[0].pos);

        for(int i=1;i<n;i++){
            if(meetings[i].start>=freetime){
                freetime=meetings[i].end;
                ans.add(meetings[i].pos);
            }
        }
        System.out.println("The maximum number of meetings that can be held is: " + ans.size());
        System.out.println("The order of meetings happen is ");
        System.out.println(ans);
    }
}