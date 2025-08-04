package loops;

public class allevenoddnumber {
    public static void main(String[] args) {
        

       for(int i=1;i<=100;i++)
       {
        if(i%2!=0) //print odd numbers from 1 to 100
        {
            System.out.println(i);
        }
       }

       for(int i=1;i<=100;i++)
       {
        if(i%2==0) //print even numbers from 1 to 100
        {
            System.out.println(i);
        }
       }
       for(int j=2;j<=100;j+=2)
       {
        System.out.println(j);
       }

    }
}
