import java.util.HashMap;
import java.util.PriorityQueue;

public class handsofstraights {

     private static  boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(hand.length%groupSize!=0) return false;

        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i:hand){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(mp.keySet());

        while(!mp.isEmpty()){
            int start = pq.peek();

            for(int i=0;i<groupSize;i++){
                int card = start + i;

                if(!mp.containsKey(card)) return false;

                mp.put(card,mp.get(card)-1);

                if(mp.get(card)==0){
                    mp.remove(card);
                    if(card!=pq.peek()) return false;
                    pq.poll();
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] hand={1,2,3,6,2,3,4,7,8};
        int groupSize=3;
        if(isNStraightHand(hand, groupSize)){
            System.out.println("The hand can be rearranged into groups of straights");
        }
        else{
            System.out.println("The hand cannot be rearranged into groups of straights");
        }
    }
}
