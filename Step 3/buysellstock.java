public class buysellstock {
    public static void main(String[] args) {
        int[] price={7,3,5,1,2,2};
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
            if(price[i]<minprice){
                minprice=price[i];
            } else if(price[i]-minprice>maxprofit){
                maxprofit=price[i]-minprice;
            }
        }
        System.out.println(maxprofit);
    }
}