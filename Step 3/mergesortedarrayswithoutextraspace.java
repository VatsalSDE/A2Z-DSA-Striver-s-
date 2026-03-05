public class mergesortedarrayswithoutextraspace {

    public static void leetcodeversion(int[] num1 , int m , int[] num2 , int n){
        
        // first will initialize the three pointers 
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0){
            if(num1[i]>=num2[j]){
                num1[k--]=num1[i--];
            }
            else{
                num1[k--]=num2[j--];
            }
        }
        // if there are some elements left in num2 then we will copy them to num1
        while(j>=0){
            num1[k--]=num2[j--];
        }
        // because in the num1 the elements are already sorted okk so yess
    }
    public static void main(String[] args) {    
        int[] num1={1,2,3,0,0,0};
        int m=3;
        int[] num2={2,5,6};
        int n=3;

        leetcodeversion(num1,m,num2,n);

        // now we will print the merged array 
        System.out.println("The answer of the leetcode version");
        for(int i=0;i<num1.length;i++){
            System.out.print(num1[i]+" ");
        }
    }
}
