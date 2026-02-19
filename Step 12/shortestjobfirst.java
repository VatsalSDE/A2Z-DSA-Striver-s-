import java.util.Arrays;

public class shortestjobfirst {
    public static void main(String[] args) {
        int[] arr={3,1,2,5,4};
        int n=arr.length;
        Arrays.sort(arr);
        int time=0;
        int waittime=0;

        for(int i=0;i<n;i++){
            waittime+=time;
            time+=arr[i];
        }
        System.out.println("Total Waiting Time: "+waittime);
        double ans=waittime/n;
        System.out.println("Average Waiting Time: "+ans);
    }
}
