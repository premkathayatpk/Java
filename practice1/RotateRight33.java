import java.util.Scanner;

class RotateRight33 {
  static int rotateRigth(int[] arr) {
    int temp = arr[arr.length - 1];
    int i;
    for (i = 1; i < arr.length; i++) {
      arr[0] = temp;
      arr[i] = arr[i + 1];
    }
    return arr[i];
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter size of array.");
    int size = scan.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter" + size + " elements of array.");
    for (int i = 0; i < size; i++) {
      arr[i] = scan.nextInt();
    }
    System.out.println(rotateRigth(arr));
    scan.close();
  }
}