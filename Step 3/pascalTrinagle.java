import java.util.ArrayList;
import java.util.List;

public class pascalTrinagle {
    public static void main(String[] args) {
        int numRows=3;

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> ls = new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    ls.add(1);
                }
                else{
                    ls.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(ls);
        }
        System.out.println("The required pascal triangle is in the final answer form is ");

        for(List<Integer> ls:ans){
            System.out.println(ls);
        }
    }
}
