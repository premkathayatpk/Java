import java.util.Arrays;

public class CheckArrayPalindrome {
    public static int[] reverse(int[] arr){
        int[] rev=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            rev[j]= arr[i];
            j++;
        }

        return rev;
    }
    static void isPalindrome(int[] arr ){
        int[] rev=reverse(arr);
        if(Arrays.equals(rev, arr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palendrome.");
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,2,3,2,3};
         isPalindrome(arr);
    }
}
