import java.util.*;

public class P11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        System.out.println("Enter a number ");
        n = scan.nextInt();

        if (n < 10)
            if (n > 0)
                System.out.println("The number is positive.");
            else
                System.out.println("The number is negative");

        scan.close();

    }
}
