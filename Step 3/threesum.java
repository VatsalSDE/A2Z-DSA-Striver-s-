import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threesum {

    public List<List<Integer>> brute(int[] arr){

        Set<List<Integer>> st = new HashSet<>();
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i] + arr[j] +arr[k] == 0){
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(st);
    }

    public List<List<Integer>> better3sum(int[] arr){
        int n=arr.length;

        Set<List<Integer>> st= new HashSet<>();

        for(int i=0;i<n;i++){
            Set<Integer> ans=new HashSet<>();

            for(int j=i+1;j<n;j++){
                int third=-(arr[i]+arr[j]);

                if(ans.contains(third)){
                    List<Integer> Temp = Arrays.asList(arr[i],arr[j],third);
                    Collections.sort(Temp);
                    st.add(Temp);
                }

                ans.add(arr[j]); // if not there in the set okk
            }
        }
        return new ArrayList<>(st);
    }

    public List<List<Integer>> optim3sum(int[] arr){
        int n=arr.length;

        List<List<Integer>> ans = new ArrayList<>();

        // sort the array 
        Arrays.sort(arr);

        for(int i=0;i<n;i++){

            // first will remove the duplicate sokk so yeahh
            if(i!=0 && arr[i]==arr[i-1]){
                continue;
            }

            // now will take the two pointers

            int j=i+1;
            int k=n-1;
            
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];

                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;    
                    while(j<k && arr[j]==arr[j-1]){ // to remove the duplicate
                        j++;
                    }
                    while(j<k && arr[k]==arr[k+1]){ // to remove the duplicate
                        k--;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        // here we have to return the triplet of the array that sum upto 0 

        int[] arr = {-1,0,1,2,-1,-4};
        threesum obj = new threesum();
        // List<List<Integer>> ans = obj.brute(arr);
        // System.out.println(ans);

        // Better Approach
        // List<List<Integer>> ans = obj.better3sum(arr);
        // System.out.println(ans);

        // Optimal Approach
        List<List<Integer>> ans = obj.optim3sum(arr);
        System.out.println(ans);
    }
}
