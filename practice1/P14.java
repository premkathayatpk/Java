import java.util.*;

public class P14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter an integer: ");
        n = scan.nextInt();
        if (n < 10)
            System.out.println("Less than 10");
        else if (n > 15)
            System.out.println("Grater than 5");
        else
            System.out.println("not Interesting");
        scan.close();
    }

}
