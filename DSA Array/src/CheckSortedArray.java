import java.util.*;
public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter element of array: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        checkSorted(arr);
    }

    static boolean checkSorted(int[] arr){

        return  true;
    }
}
