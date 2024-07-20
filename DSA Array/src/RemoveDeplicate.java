import java.util.Arrays;

public class RemoveDeplicate {
    public static int removeDup(int[] nums){
        int n=nums.length;
        Arrays.sort(nums);
        int j=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }

        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2};
        System.out.println(removeDup(nums));
    }
}
