import java.util.*;

public class SumFromTo21 {
    public static int sumFromTo(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Enter first and last number: ");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(sumFromTo(a, b)); // prints 22 because 4+5+6+7 = 22

        scan.close();

    }
}
