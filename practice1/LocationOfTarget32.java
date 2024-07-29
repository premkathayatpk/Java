import java.util.Scanner;

class LocationOfTarget32 {
  static int locationOfTarget(int[] arr, int target) {
    int i;
    int best = 0;
    for (i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        best = i;

      }

    }
    return best;

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
    System.out.println("Enter target value.");
    int target = scan.nextInt();

    System.out.println("Location of Largest is " + locationOfTarget(arr, target));

    scan.close();
  }
}