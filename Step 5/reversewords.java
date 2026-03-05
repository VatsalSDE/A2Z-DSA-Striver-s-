import java.util.Scanner;

public class reversewords {

    private static String gfgversion(String s){
        StringBuilder ans = new StringBuilder();

        int i=s.length()-1;

        while(i>=0){
            
            while(i>=0 && s.charAt(i)=='.'){
                i--;
            }

            if(i<0) break;

            int j=i;

            while(i>=0 && s.charAt(i) != '.'){
                i--;
            }
            ans.append(s.substring(i+1, j+1)).append('.');
        }
        return ans.toString();
    }

    private static String leetcodeoptiversion(String s ){
        StringBuilder sb = new StringBuilder();

        int i =s.length()-1;

        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }

            if(i<0) break;

            int j=i;
            while(i>=0 && s.charAt(i) != ' '){
                i--;
            }
            if(sb.length()>0){
                sb.append(' ');
            }
            sb.append(s.substring(i+1, j+1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Vatsal is good boy";
        String [] words = s.trim().split("\\s+");  // here trim will cut the all trailing spaces from left and right and the split function will split the words with single spaces managing the multiple spaces

        int n = words.length;

        StringBuilder result = new StringBuilder();

        for(int i=n-1 ; i>=0 ; i--){
            result.append(words[i]);
            if(i != 0) result.append(" ");  // here we have use the condition so that the result will not add a space at the end other wise the output will look like 
            // "boy good is vatsal " see extra trailing space at the end 
        }

        System.out.println(result.toString());
    }
}