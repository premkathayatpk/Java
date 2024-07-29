import java.util.Scanner;

class LocationOfLargest31 {
  public static int locationOfLargest(int[] arr) {
    int i;
    int best = 0;
    for (i = 1; i < arr.length; i++) {
      if (arr[best] < arr[i]) {
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

    System.out.println("Location of Largest is " + locationOfLargest(arr));

    scan.close();

  }
}