import java.util.*;

public class P15 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a non‐negative integer: ");
        n = scan.nextInt();

        do {

            if (n < 0)
                System.out.println("The integer you entered is negative.");
            System.out.println("Enter a non‐negative integer: ");
            n = scan.nextInt();
        } while (n < 0);

        scan.close();

    }
}
