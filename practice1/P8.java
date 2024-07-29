import java.util.*;

public class P8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message;
        System.out.println("Enter a sentence on the line below.");
        // message=scan.next();
        message = scan.nextLine();
        System.out.println(message);
        scan.close();
    }

}
