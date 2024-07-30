import java.util.Arrays;

public class RemoveDuplicateNumArray38 {
  static int eliminateDuplicates(int[] nums) {
    int n = nums.length;
    Arrays.sort(nums);
    int j = 1;
    for (int i = 1; i < n; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[j] = nums[i];
        j++;
      }
    }

    return j;
  }

  public static void main(String[] args) {
    int[] arr = { 58, 26, 58 };
    System.out.println(eliminateDuplicates(arr));
  }
}