public class buysellstock {
    public static void main(String[] args) {
        int[] price={7,1,5,3,6,4};
        int n=price.length;


        // This is the Bruteforce method 
        // int profit =0;

        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(price[j]>price[i]){
        //             int curpro=price[j]-price[i];
        //             if(curpro>profit){
        //                 profit=curpro;
        //             }
        //         }
        //     }
        // }

        // System.out.println(profit);

        // optimal method
        int minprice = Integer.MAX_VALUE;
        int maxprofit =0;
        for(int i=0;i<n;i++){
            minprice=Math.min(minprice, price[i]);
            maxprofit=Math.max(maxprofit, price[i]-minprice);
        }
        System.out.println(maxprofit);

        // now for specially the gfg question the simple change is that the like it takes multiple transactions also okk so yeah now go for it 
        int profit =0;

        for(int i=1;i<n;i++){
            if(price[i]>price[i-1]){
                profit+=price[i]-price[i-1];
            }
        }
        System.out.println(profit);
    }
}