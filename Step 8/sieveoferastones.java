public class sieveoferastones {

    private static int count(int n){
        
        if(n<=2) return 0;

        boolean[] isprime=new boolean[n+1];

        for(int i=2;i<n;i++){
            isprime[i]=true;
        }

        // now the sieve process 

        for(int i=2;i*i<n;i++){
            if(isprime[i]){
                for(int j=i*i ; j<n ; j+=i){
                    isprime[j]=false;
                }
            }
        }

        // count all prime numbers 

        int count = 0;
        for(int i=0;i<n;i++){
            if(isprime[i])
            { count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int n=3;
        
        int count = count(n);
        System.out.println(count);
    }
}
