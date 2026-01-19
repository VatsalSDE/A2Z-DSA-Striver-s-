import java.util.PriorityQueue;

public class connectnropes {
    public static void main(String[] args) {
        int[] ropes ={2,6,3,4};
        int n=ropes.length;

        PriorityQueue<Integer> pq= new  PriorityQueue<>();

        for(int i : ropes){
            pq.add(i);
        }

        int totalcost=0;
        
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            
            int cost = first + second;
            totalcost += cost;

            pq.offer(cost);
        }
        System.out.println("Minimum cost to connect ropes: " + totalcost);
    }
}
