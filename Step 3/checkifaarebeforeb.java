public class checkifaarebeforeb {
    public static void main(String[] args) {
        String s="abaab";
        int n=s.length();

        int sum;
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(i==n-1){
                break;
            }
            int a =(int)(s.charAt(i));
            int b= (int)(s.charAt(i+1));

            sum=a-b;
            System.out.println(sum);
            if(sum==1){
                flag=false;
                break;
            }
        }
        if(flag==false){
            System.out.println("The string is not valid");
        }
        else{
            System.out.println("The string is valid");
        }
    }
}
