public class floorandceil {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};

        int x=5;

        // so like here we have to find the floor and ceil

        // floor is like max(<=x)
        // ceil is like min(>=x)

        int n=arr.length;

        int low=0;
        int high=n-1;

        int mid = 0;

        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;

        while(low<=high){
            mid=(high-low)/2+low;    

            if(arr[mid] <= x){
                floor=Math.max(floor, arr[mid]);
                low=mid+1;
            }
            else{
                ceil=Math.min(ceil, arr[mid]);
                high=mid-1;
            }
        }
        System.out.println("The floor of the element x is "+floor);
        System.out.println("The ceil of the element x is "+ceil);
    }
}
