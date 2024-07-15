import java.util.*;
public class P13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        float income;
        System.out.println("Enter your Monthly income: ");
        income=scan.nextFloat();
        
        if(income<0.0)
            System.out.println("You are going farther into debt every month.");
        else if(income>=0.0 && income<1200.00)
            System.out.println("You are living below the poverty line. ");
        else if(income>=1200.00 && income<2500.00)
            System.out.println("You are living in moderate comfort.");
        else if(income>=2500)
            System.out.println("You are well off.");
        
    }
}
