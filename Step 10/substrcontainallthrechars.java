public class substrcontainallthrechars {
    private static boolean check(String s ){
        if(s.contains("a") && s.contains("b") && s.contains("c")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abcba";
        int n=s.length();
        int count=0;

        // for(int i=0;i<n;i++){
        //     String test="";
        //     for(int j=i;j<n;j++){
        //         test+=s.charAt(j);
        //         if(check(test)){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);

        // Optimal Approach
        int[] hash={-1,-1,-1};
        for(int i=0;i<n;i++){
            hash[s.charAt(i)-'a']=i;
            count+=1+Math.min(hash[0],Math.min(hash[1],hash[2]));
        }
        System.out.println(count);
    }
}
