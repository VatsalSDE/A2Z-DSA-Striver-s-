import java.util.Arrays;

public class jobsequencing {

    static class job{
        int id;
        int deadline;
        int profit;

        job(int id,int deadline,int profit){
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public static void main(String[] args) {
        int n=8;
        job[] arr = new job[8];
        arr[0]=new job(7,2,10);
        arr[1]=new job(1,4,20);
        arr[2]=new job(8,2,22);
        arr[3]=new job(5,4,25);
        arr[4]=new job(7,2,60);
        arr[5]=new job(4,6,65);
        arr[6]=new job(3,6,70);
        arr[7]=new job(6,2,80);

        Arrays.sort(arr,(a,b) -> b.profit-a.profit);

        int totalprofit=0;
        int count=0;
        int maxdeadline=-1;

        for(int i=0;i<n;i++){
            maxdeadline=Math.max(maxdeadline, arr[i].deadline);
        }
        int slot[]=new int[maxdeadline+1]; // this is the hasharray
        
        // now initialize the whole hasharray as -1
        for(int i=0;i<slot.length;i++){
            slot[i]=-1;
        }

        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>=0;j--){
                if(slot[j]==-1){
                    slot[j]=i; // assign the job to that slot
                    totalprofit+=arr[i].profit;
                    count++;
                    break;
            }
        }
    }

    System.out.println("The number of jobs done are "+count);
    System.out.println("the total profit is "+totalprofit);

}
}
