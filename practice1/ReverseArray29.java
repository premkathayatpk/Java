import java.util.Arrays;

class ReverseArray29 {
  
  // Method to sort the array
  static void reverse(float[] a) {
   int left=0;
   int right =a.length-1;
  while(left<right){
    float temp=a[left];
    a[left]=a[right];
    a[right]=temp;
    left++;
    right--;
  }
  }
  
  public static void main(String[] args) {
    float[] a = {1.1f, 9.7f, 5.0f};
    reverse(a);
   
    System.out.println(Arrays.toString(a));
    
   
  }
}
