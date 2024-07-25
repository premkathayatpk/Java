import java.util.Arrays;

public class MeargSortedArray {
    public static int[] mearg(int[] arr1, int[] arr2){
        int[] meargArr=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
           while(i<arr1.length && j<arr2.length){
              if(arr1[i]<arr2[j])
                meargArr[k++]=arr1[i++];
              else
                  meargArr[k++]=arr2[j++];
        }
           while(i<arr1.length){
               meargArr[k++]=arr1[i++];
           }
        while(j<arr2.length){
            meargArr[k++]=arr2[j++];
        }
    Arrays.sort(meargArr);
        return meargArr;
    }
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={2,4,5,8};
        System.out.println(Arrays.toString(mearg(arr1,arr2)));
    }
}
