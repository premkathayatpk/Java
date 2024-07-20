import java.util.Arrays;
public class DuplicateNum287 {
    public static int findDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }


        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
