import java.util.*;
public class TestPrime4 {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=n/2;i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=scan.nextInt();
        if(isPrime(n)){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+ " is not prime");
        }


    }
}
