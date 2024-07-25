import java.util.*;
public class ReversArray {
    public static int[] reverse(int[] arr){
        int[] rev=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            rev[j]= arr[i];
            j++;
        }

        return rev;
    }


    public static void main(String[] args) {
        int[] arr = {3,2,3,2,3};
        int[] reversedArr = reverse(arr);
        System.out.println(Arrays.toString(reversedArr));
    }
}

