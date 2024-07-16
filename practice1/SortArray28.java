import java.util.Arrays;

class SortArray28 {
  
  // Method to sort the array
  static void sort3(float[] a) {
    Arrays.sort(a);
  }
  
  public static void main(String[] args) {
    float[] a = {1.1f, 9.7f, 5.0f};
    
    // Sort the array
    sort3(a);
    
    // Print the sorted array
    System.out.println(Arrays.toString(a));
  }
}
