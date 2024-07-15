
public class Function23 {
    public static int gcd(int a,int b){
       if(a<=0 || b<=0)
        return 0;
    
       int trialDivisor;
       trialDivisor=(a<=b?a:b);
       while(a%trialDivisor !=0 || b%trialDivisor !=0)
           --trialDivisor;
    
    return trialDivisor;
}
    public static void main(String[] args) {
        System.out.println(gcd(20,50));
    }
}
