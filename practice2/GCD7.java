public class GCD7 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int calculateGCD(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int []arr={10,20,40,50};
        System.out.println( calculateGCD(arr));
    }
}
