public class DigitIntoWord {
    public static void word(int digit){
        switch(digit){
            case 0:
                System.out.print("Zero ");
                break;
            case 1:
                System.out.print("One ");
            break;
            case 2:
                System.out.print("Two ");
            break;
            case 3:
                System.out.print("Three ");
            break;
            case 4:
                System.out.print("Four ");
            break;
            case 5:
                System.out.print("Five ");
            break;
            case 6:
                System.out.print("Six ");
            break;
            case 7:
                System.out.print("Seven ");
            break;
            case 8:
                System.out.print("Eight ");
            break;
            case 9:
                System.out.print("Nine ");
            break;
            default:
                System.out.print("Invalid ");
                break;

        }
    }
    public static void digit(int n){
        StringBuilder result = new StringBuilder();
if(n==0){
    word(0);
}
        while(n!=0){
            int rem=n%10;
            word(rem);
            n/=10;
        }
        result.reverse();

        // Print the result
        System.out.println(result.toString());
    }
    public static void main(String[] args) {
    int n=1234;

        digit(n);
    }
}
