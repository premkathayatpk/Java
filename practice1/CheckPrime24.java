
public class CheckPrime24 {
    public static int isPrime(int n){
        int flag=0;
        if(n<=1)
            flag =0;
    
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=0;
                break;
                
            }
        
            else{
                flag=1;
            }
    }
        
     if(flag==1){
         return 1;
     }
     else{
         return 1;
     }
    }
    public static void main(String[] args) {
        System.out.println( isPrime(8));
    }
}
