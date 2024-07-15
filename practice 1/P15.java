import java.util.*;
public class P15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       int n;
do
{
    System.out.println("Enter a non‐negative integer: ");
    n= scan.nextInt();
    if (n < 0)
        System.out.println("The integer you entered is negative.");
}
while (n < 0);

        
    }
}
