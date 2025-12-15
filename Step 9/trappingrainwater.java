public class trappingrainwater {

    private static int[] pref(int[] arr){
        int n=arr.length;
        int[] prefm=new int[n];
        
        prefm[0]=arr[0];
        for(int i=1;i<n;i++){
            prefm[i]=Math.max(prefm[i-1],arr[i]);
        }

        return prefm;
    }

    private static int[] suff(int[] arr){
        int n=arr.length;
        int[] suffm=new int[n];

        suffm[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffm[i]=Math.max(suffm[i+1],arr[i]);
        }

        return suffm;
    }
    public static void main(String[] args) {
        int[] arr ={0,1,0,2,1,0,1,3,2,1,2,1};
        int n=arr.length;

        int[] prefixmax=pref(arr);
        int[] suffmax=suff(arr);

        int totaltrapwater=0;

        for(int i=0;i<n;i++){
            int leftmax=prefixmax[i];
            int rightmax=suffmax[i];

            if(arr[i]<leftmax && arr[i]<rightmax){
                totaltrapwater+=Math.min(leftmax, rightmax)-arr[i];
            }
        }
        System.out.println("The total trapped rain water is "+totaltrapwater);
    }
}
