public class AvgNumArray {
    public static int average(int n,int[] arr){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum/n;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;

        System.out.println("Average = "+average(n,arr));

    }
}
