import java.util.Scanner;

public class SimpleInterest5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Princlpe amount: ");
        float p=scan.nextFloat();
        System.out.println("Enter Rate % ");
        float r=scan.nextFloat();
        System.out.println("Enter Time in year: ");
        float t=scan.nextFloat();

       float si=(p*t*r)/100;
        System.out.println("Simple Interest is "+si);

    }
}
