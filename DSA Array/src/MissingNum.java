import java.util.Arrays;
public class MissingNum {
    public static int missNum(int n,int[] arr){
        int[] a=new int[n+1];
        Arrays.fill(a,-1);
        for(int i=0;i<n;i++){
            a[arr[i]]=arr[i];
        }
        for(int i=1;i<=n;i++) {
            if (a[i] == -1) {
                return i;
            }
        }
        return 0;
        }
        public static void main(String[] args)
        {
            int[] arr = {0,2};
            int n = arr.length;
            System.out.println(missNum(n,arr));

        }

}
