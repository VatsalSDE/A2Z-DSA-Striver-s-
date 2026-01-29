public class jumpgame {

    private static boolean checkpossible(int[] arr){
        int n=arr.length;

        int maxIndex=0;

        for(int i=0;i<n;i++){
            if(i>maxIndex){
                return false;
            }

            maxIndex=Math.max(maxIndex, i+arr[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] jump={1,2,4,1,1,0,2,5};
        int n=jump.length;

        System.out.println(checkpossible(jump));
    }
}
