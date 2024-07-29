import java.util.*;

class CheckAscOrderedArr39 {
  static boolean isOrdered(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter size of array:");
    int s = scan.nextInt();

    System.out.println("Enter element of array;");
    int[] arr = new int[s];
    for (int i = 0; i < s; i++) {
      arr[i] = scan.nextInt();

    }
    System.out.println(isOrdered(arr));
    scan.close();
  }
}