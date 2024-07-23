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
        boolean isInc=isIncreasing(arr);
        boolean isDec= isDecreasing(arr);
        if(isInc || isDec){
            System.out.println("Sorted array");
        }
        else{
            System.out.println("Not sorted array. ");
        }
    }
    static boolean isIncreasing(int[] arr){
        int i=1;
        while(i<arr.length){
            if(arr[i]<arr[i-1]){
                return false;
            }
            i++;
        }
        return  true;
    }

    static boolean isDecreasing(int[] arr){
        int i=1;
        while( i<arr.length){
            if(arr[i]>arr[i-1])
                return  false;
            i++;
        }
        return  true;
    }
}
