public class anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        char[] array= s.toCharArray();
        
        int n= array.length;
        boolean found = false;

        for(int i=0;i<n;i++){
            char check = t.charAt(i);
            for(int j=0;j<n;j++){
                if(array[j]==check){
                    found=true;
                    break;
                }
            }
        }

        if(found==false){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
