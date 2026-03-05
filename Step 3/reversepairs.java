public class reversepairs {

    public static int count;

    public static void merge(int[] a , int[] b , int[] arr){
        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                arr[k++]=a[i++];
            }
            else{
                arr[k++]=b[j++];
            }
        }

        while(i<a.length){
            arr[k++]=a[i++];
        }

        while(j<b.length){
            arr[k++]=b[j++];
        }
    }

    public static void countinvefunct(int[]a , int[] b){
        int i=0;
        int j=0;

        while(i<a.length && j<b.length){
            if((long)a[i] > (long)2*b[j]){
                count+=(a.length - i);
                j++;
            }
            else{
                i++;
            }
        }
    }

    public static void mergeSort(int[]arr){
        int n=arr.length;

        if(n==1) return;

        int[] a=new int[n/2];
        int[] b=new int[n-n/2];

        for(int i=0;i<n/2;i++){
            a[i]=arr[i];
        }

        for(int i=0;i<n-n/2;i++){
            b[i]=arr[i+n/2];
        }

        mergeSort(a);
        mergeSort(b);

        // now we will do the count inverion step okk so yes here 
        countinvefunct(a,b);

        merge(a, b, arr);

        a=null;
        b=null;
    }
    public static void main(String[] args) {
        int[] arr ={1,3,2,3,1};
        count=0;
        mergeSort(arr);
        System.out.println(count);
    }
}
