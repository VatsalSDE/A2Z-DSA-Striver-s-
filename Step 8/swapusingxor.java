public class swapusingxor {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        // swapping the number using the xor operator
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("value of a is "+a+" value of b is "+b);
    }
}
