public class MissingNum {
    public static int missNum(int n,int[] arr){
        int[] a=new int[n+1];
        for(int i=0;i<n-1;i++){
            a[arr[i]]++;
    }
        for(int i=1;i<=n;i++) {
            if (a[i] == 0) {
                return i;
            }
        }
            return -1;
        }
        public static void main(String[] args)
        {
            int[] arr = { 1, 2, 3,5,4 };
            int n = 6;
            System.out.println(missNum(n,arr));

        }

}
