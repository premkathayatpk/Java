public class P30 {
    public static float sum(float[] arr){
        float sum=0f;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
    float[] arr={5.8f,2.6f,9f,3.4f,7.1f};
        System.out.println("sum of array is "+sum(arr));
    }
}
