public class maxconsecutiveones {
    public static void main(String[] args) {
        int[] arr= {1,1,0,0,1,1,1,1,0,0};
        int n =arr.length;

        int count=0;
        int maxcount=0;

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            if(arr[i]==0){
                maxcount=Math.max(count,maxcount);
                count=0;
            }
        }
        
        System.out.println("The maximum number of consecutive once in the array are "+maxcount);
    }
}


int n=arr.length;
        int maxze=-1;
        int cntz=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                cntz++;
            }
            else{
                if(cntz>maxze){
                    maxze=cntz;
                }
                cntz=0;
            }
        }
        maxze=Math.max(maxze,cntz);
        
        int maxon=-1;
        int cnton=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                cnton++;
            }
            else{
                if(cnton>maxon){
                    maxon=cnton;
                }
                cnton=0;
            }
        }
        maxon=Math.max(cnton,maxon);
        
        return Math.max(maxon,maxze);