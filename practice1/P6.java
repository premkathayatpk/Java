public class P6 {
    public static void main(String[] args) {
        boolean found = false; // Correctly initializing found as a boolean
        int count = 5;

        if (!found || --count == 0) {
            System.out.println("danger");
        }

        System.out.println("count = " + count);
    }
}
