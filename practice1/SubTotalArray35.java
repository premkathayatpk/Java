import java.util.*;
class SubTotalArray35{
  static float[] subtotal(float[] arr){
    int size=arr.length;
    int i;
    for( i=1;i<size;i++){
      arr[i]+=arr[i-1];
    }
    for( i=0;i<size;i++){
      System.out.println(arr[i]);
    }
   
    return arr;
  }
  public static void main(String[] args){
    float[] arr={5.8f,2.6f,9.1f,3.4f,7.0f};
    // subtotal(arr);
    System.out.println(Arrays.toString(subtotal(arr)));
  }
}