import java.util.Arrays;

public class minimumplatform {
    public static void main(String[] args) {
        int [] arival = {900, 945, 955, 1100, 1500, 1800};
        int [] departure= {920, 1130, 1150, 1200, 1900, 2000};

        // now first sort the arrays both arrival and departure okk

        Arrays.sort(arival);
        Arrays.sort(departure);

        int i=0;
        int j=0;

        // here we jave initialized two variables that is one for the cuurent and then the ansewer
        int platform=0;
        int maxplatform=0;

        int n = arival.length;

        while(i<n && j<n){
            if(arival[i] <= departure[j]){
                platform++;
                i++;
                maxplatform=Math.max(maxplatform, platform);
            }
            else{
                platform--;
                j++;
            }
        }
        System.out.println("The minimum platforms required are the "+maxplatform);
    }
}
