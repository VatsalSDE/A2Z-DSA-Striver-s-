public class mergesort {

    private static int[] merge(int[] a , int[] b, int[] arr){
        // taking three pointers for the three arrays 
        int i=0;
        int j=0;
        int k=0;

        int n=a.length;
        int m=b.length;

        while(i<n && j<m){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                i++;
                k++;
            }
            else{
                arr[k]=b[j];
                j++;
                k++;
            }
        }

        if(i==n){
            while(j<m){
                arr[k]=b[j];
                j++;
                k++;
            }
        }
        else{
            while(i<n){
                arr[k]=a[i];
                i++;
                k++;
            }
        }

        return arr;
    }

    private static void mergesortarray(int[] arr){
        int n=arr.length;
        if(n==1) return;

        // this is every time we are dividing the array into two parts till we have single elements  
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];

        // now copypaste the elements of the array into both arrays accoridingly 
        for(int i=0 ; i<n/2;i++) a[i]=arr[i];

        for(int i=0;i<n-n/2;i++) b[i]=arr[i+n/2];

        mergesortarray(a);
        mergesortarray(b);

        // now we will have the magic of recursion merege the two sorted aarrays 
        merge(a,b,arr);

        a=null ; b=null;
    }
    public static void main(String[] args) {
        int[] arr={21,23,34,10,11,20,1,2,20};
        
        System.out.println("The array befor merge is ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        mergesortarray(arr);
        System.out.println("The array after merge is ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
