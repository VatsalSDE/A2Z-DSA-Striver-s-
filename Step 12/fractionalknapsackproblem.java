import java.util.Arrays;

public class fractionalknapsackproblem {

    public double greedysolu(int w , Item[] arr , int n){
        double finalvalue=0.0;

        Arrays.sort(arr, 
            (a, b) -> Double.compare
            ((double)b.value / b.weight, (double)a.value / a.weight));

            for(int i=0;i<n;i++){
                if(w>=arr[i].weight){
                    w -= arr[i].weight;
                    finalvalue += arr[i].value;
                }
                else{
                    finalvalue += arr[i].value * ((double)w / arr[i].weight);
                    break;
                }
            }
        return finalvalue;
    }
    // Class to represent an item with value and weight
   static class Item {
        int value;
        int weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
        fractionalknapsackproblem fk = new fractionalknapsackproblem();
        Item[] arr = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };
        int w = 50;
        int n = arr.length;
        double result = fk.greedysolu(w, arr, n);
        System.out.println("Maximum value in Knapsack = " + result);
    }
}