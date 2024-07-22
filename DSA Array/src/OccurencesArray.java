import java.util.*;
public class OccurencesArray {
    static int Occurence(int[] arr,int num){
        int occur=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                occur++;
            }
        }
        return occur;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        System.out.println("Enter a number do you find: ");
        int num=scan.nextInt();
        System.out.println("Your element was found. " +Occurence(arr,num)+" timesin array");

    }
}
