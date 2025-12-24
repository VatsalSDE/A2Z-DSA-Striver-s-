import java.util.ArrayList;
import java.util.List;
// this is the bruteforce method 
class stock{
    List<Integer> prices;

    public stock(){
        prices = new ArrayList<>();
    }

    public int next(int price){
        prices.add(price);
        int span=0;

        for(int i=prices.size()-1;i>=0;i--){
            if(prices.get(i)>=price){
                span++;
            }
            else{
                break;
            }
        }
        return span;
    } 

}

public class stockspanner {
    public static void main(String[] args) {
        stock st=new stock();
        System.out.println("The value of stock spanner with priece 7 is "+st.next(7));
        System.out.println("The value of stock spanner with priece 2 is "+st.next(2));
        System.out.println("The value of stock spanner with priece 1 is "+st.next(1));
        System.out.println("The value of stock spanner with priece 3 is "+st.next(3));
        System.out.println("The value of stock spanner with priece 3 is "+st.next(3));
        System.out.println("The value of stock spanner with priece 8 is "+st.next(8));
    }
}
