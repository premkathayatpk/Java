import java.util.Arrays;
class ConcatenateTwoArray36{
  public static int[] concatenate(int[] arr1,int[] arr2){
    int m=arr1.length;
    int n=arr2.length;
    int[] arr3=new int[m+n];
    for(int i=0;i<m;i++){
      arr3[i]=arr1[i];
    }
    for(int i=0;i<n;i++){
      arr3[m+i]=arr2[i];
    }
    return arr3;
  }

  public static void main(String[] args){
    int[] arr1={58,26,91,34,70,34,88};
    int [] arr2={29,41,10,66};
    System.out.println(Arrays.toString(concatenate(arr1,arr2)));
  }
}