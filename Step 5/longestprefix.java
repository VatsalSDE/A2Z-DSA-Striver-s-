public class longestprefix {

    private static String common(String s1 , String s2){

        // here for travaersal will take the minimum length only of both okk so yeah then only like the miniimim only possible

        int n=Math.min(s1.length(), s2.length());

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] str={"flower","flow","flour"};

        int n=str.length;

        // here we will initialize the first string from the array to the resultant
        String res=str[0];

        // start traversal from the i=1 index because the 0th index is already initialized okk so yes

        for(int i=1;i<n;i++){
            res=common(res,str[i]);
        }

        System.out.println("The longest common prefix is the ");
        System.out.println(res);
    }
}