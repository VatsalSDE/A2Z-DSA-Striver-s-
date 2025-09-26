public class union {
    public static void main(String[] args) {
        int[] arr = {23,34,45,56};
        int[] brr={11,30,40,50};
        int n=arr.length;
        int m=brr.length;
        // now we have to merge or union this two sorted arrays 
        // so first make the resultant array of size == add of both the sorted arrays 
        int[] crr = new int[n+m];
        // we will take three pointers that will point all the three arrays respectively
        int i=0; // -->> arr
        int j=0; // -->> brr
        int k=0; // -->> crr
        while(i<n && j<m){
            if(arr[i]<=brr[j]){
                crr[k]=arr[i];
                i++;
                k++;
            }
            else{
                crr[k]=brr[j];
                k++;
                j++;
            }
        }
        if(i==n){
            while(j<m){
                crr[k]=brr[j];
                k++;
                j++;
            }
        }
        if(j==m){
            while(i<n){
                crr[k]=arr[i];
                k++;
                i++;
            }
        }
        // now printing the merged sorted array 
        for (int l : crr) {
            System.out.print(l + " ");
        }
    
    }
}