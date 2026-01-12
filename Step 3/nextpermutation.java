public class nextpermutation {

    private static void reverse(int[] arr , int i , int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }
    private static void swap(int[] arr , int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,7,4,3,1};
        int n=arr.length;

        // The bruteforce solution will be like here we need to find all the permutations and then like just match and return but it takes factorial time complexity so not possible okk so yaa go for it now 

        // Optimal solution
        // first we will find the breaking point okk yaa so go for it now
        int breakind=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                breakind=i;
                break;
            }
        }
        // if breakind is -1 means array is in descending order so we will reverse the array
        if(breakind==-1) // so the array is in descending order that is the last permutations so basically we will reverse the array and it is our required answer 
        {
            reverse(arr, 0, n-1);
        }
        else{
            // now we will findd the just greater element from the arr[breakind] okk and then will swap with the arr[breakind]
            int justgreaterind=-1;
            for(int i=n-1;i>breakind;i--){
                if(arr[i]>arr[breakind]){
                    justgreaterind=i;
                    break;
                }
            }
            // now we will swap the arr[breakind] and arr[justgreaterind]
            swap(arr,breakind,justgreaterind);
            // now we will reverse the array from breakind+1 to n-1
            reverse(arr, breakind+1, n-1);
        }

        System.out.println("The next permutation is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
