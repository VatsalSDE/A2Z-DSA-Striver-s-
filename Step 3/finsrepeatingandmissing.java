public class finsrepeatingandmissing {

    public static int[] findmisandrep(int[] arr){
        int n=arr.length;

        int[] hash=new int[n+1];

        for(int i=0;i<n;i++){
            hash[arr[i]]++; // so like here we increment the hash idex value accoridng to array okay 
        }

        int[] ans = new int[2];
        for(int i=1;i<hash.length;i++){
            if(hash[i]==0){
                ans[1]=i; // so here we will get the missing number 
            }
            else if(hash[i]>1){
                ans[0]=i; // so here we will get the repeating number 
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5};

        // here we have to find two things the one element repeating and the other is missing if the array should have 1 to n elements ok
        int n=arr.length;
        int[] ans = findmisandrep(arr);
        System.out.println("The repeating number is "+ans[0]);
        System.out.println("The missing number is "+ans[1]);
    }
}
