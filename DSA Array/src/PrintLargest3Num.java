import  java.util.Arrays;
public class PrintLargest3Num {
    public static void largest3(int[] arr,int arr_size){
////        for (int i=0;i<n;i++){
////            for(int j=1;j<n;j++){
////                if(arr[i]<arr[j]) {
////                    int temp = arr[i];
////                    arr[i] = arr[j];
////                    arr[j] = temp;
////                }
////            }
////        }
//        Arrays.sort(arr);
//
//            System.out.println(arr[n-1]+" "+arr[n-2]+" "+arr[n-3]);

        int i,first,second,third;
        if(arr_size<3){
            System.out.println("Invalid input");
        }
        first=second=third=Integer.MIN_VALUE;
        for(i=0;i<arr_size;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second){
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third){
                third=arr[i];
            }
        }
        System.out.println("Three largest num: "+first+" "+second+" "+third);


    }
    public static void main(String[] args) {
        int[] arr={12,13,1,10,34,1};
        int n=arr.length;
        largest3(arr,n);

    }
}
