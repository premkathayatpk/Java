public class LongDivBy6 {
    public static void div6(long n){
        if(n%6==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        long n=12345678;
        div6(n);
    }
}
