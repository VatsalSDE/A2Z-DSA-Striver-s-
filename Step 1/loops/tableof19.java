package loops;

public class tableof19 {
    public static void main(String[] args) {
        System.out.println("Print table of 19 by method 1");
        for(int i=1;i<=10;i++)
        {
            int a=19*i;
            System.out.println(a);
            
        }

        System.out.println("Print the table of 18 by method 2");
        for(int j=18;j<=180;j+=18)
        {
            
            System.out.println(j);
        }
    }
}
