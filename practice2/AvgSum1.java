import java.util.*;
public class AvgSum1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");  
        int n=scan.nextInt();
        int[] a=new int[n];
        int i,sum=0,min=0,max=0;
        System.out.println("Enter " +n+" numbers: ");
        for( i=0;i<n;i++){
             a[i]=scan.nextInt();
            sum+=a[i];
        }
       max=a[0];
       for( i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
            min=a[0];
       for( i=0;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
           
        
        System.out.println("Average is "+sum/n);
        System.out.println("Sum is "+sum);
        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
    }
       
}
