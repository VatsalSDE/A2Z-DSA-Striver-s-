public class countDigits {
   public static void main(String[] args) {
    int n=123454345;
    int count=0;

    while(n>0){
        count++;
        n=n/10;
    }
    System.out.println(count);

    // optimal method 
    // int countopt=0;
    // countopt=(int)(Math.log10(n)+1);
    // System.out.println(countopt);
   } 
}