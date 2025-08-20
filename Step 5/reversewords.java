import java.util.Scanner;

public class reversewords {
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
