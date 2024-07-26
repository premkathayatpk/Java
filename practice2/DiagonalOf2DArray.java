import java.util.*;
public class DiagonalOf2DArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of 2D Array : ");
        int r=scan.nextInt();

        int [][] arr=new int[r][r];
        System.out.println("Enter "+r+"x"+r+" element of array");
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("Input array is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Diagonal of array is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i][j]);
                }
            }

        }
    }

}
