import java.util.*;
public class CountOddEven {
    static void OddEven(int n,int[] arr){
        int countEven=0;
        int countOdd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }

        }
        System.out.println("Number of Even = "+countEven);
        System.out.println("Number of ODD = "+countOdd);

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        OddEven(n,arr);

    }
}
