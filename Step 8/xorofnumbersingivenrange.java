public class xorofnumbersingivenrange {

    private static int valueofxor(int n){
        if(n%4==1) return 1;
        if(n%4==2) return n+1;
        if(n%4==3) return 0;

        return n;
    }

    private static int findxor(int left , int right){
        return valueofxor(left-1) ^ valueofxor(right);
    }
    public static void main(String[] args) {
         int left =1;
         int right =3;

         int ans=findxor(left,right);

         System.out.println("The answer of the xor is "+ans);
    }
}