public class misc {

   private static void rotate(int[] arr , int start , int end){
      while(start<end){
         //swap 
         int temp=arr[start];
         arr[start]=arr[end];
         arr[end]=temp;

         start++;
         end--;
      }
   }
    public static void main(String[] args) {
       // converting the decimal number to the binary number okk
       int[] arr = {1,2,3,4,5,6,7};
       int n=arr.length;

       int k=2;
       String krotate = "right";

       if(krotate=="right"){
         rotate(arr, 0, n-k-1);
         rotate(arr, n-k, n-1);
         rotate(arr, 0, n-1);
       }else{
         rotate(arr, 0, k-1);
         rotate(arr, k, n-1);
         rotate(arr, 0, n-1);
       }

       System.out.println("The array after "+k+" steps "+krotate+" rotations is ");
       for (int i : arr) {
         System.out.print(i + " ");
       }

    }
  }