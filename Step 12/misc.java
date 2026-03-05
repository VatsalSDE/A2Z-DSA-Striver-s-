import java.util.Arrays;

public class misc {
    public static void main(String[] args) {
        // so here i will practice problems 
        // first is minimum platform sogeenrate inpt for that
        int[] arr={900,940,950,1100,1500,1800};
        int[] dep={910,1200,1120,1130,1900,2000};

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=0;
        int j=0;

        int platform=0;
        int maxplatform=0;

        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                platform++;
                i++;
                maxplatform=Math.max(maxplatform, platform);
            }
            else{
                platform--;
                j++;
            }
        }
        System.out.println(maxplatform);
    }
}
