import java.util.Scanner;

public class Factorial {
    static int factor(int num){
        if(num==0)
            return 1;
        else
        return num*factor(num-1);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= scan.nextInt();
        System.out.println(factor(num));
    }
}
