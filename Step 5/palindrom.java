public class palindrom {
    public static void main(String[] args) {
        String s = "Vat:,$ ,:TAV";

        int n=s.length();

        int left =0;
        int right = n-1;
        boolean flag = true;

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++; // this is for skipping non alpha numeric characters 
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;  // this is for skipping non alpha numeric characters 
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                flag=false;
                break;
            }

            left++;
            right--;
        }

        if(flag==false){
            System.out.println("There is no valid palindrome");
        }
        else {
            System.out.println("There is valid palindrome");
        }
    }
}
