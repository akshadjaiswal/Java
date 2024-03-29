import java.util.Arrays;

public class FirstAndLastPosition {

  public static void main(String[] args) {
    int[] nums = { 5, 7, 7, 8, 8, 10, 10 };
    int target = 10;
    int[] ans = searchRange(nums, target);
    System.out.println(Arrays.toString(ans));
  }

  static int[] searchRange(int[] nums, int target) {
    int[] ans = { -1, -1 };
    //check for first occurrence if the target first
    int start = Search(nums, target, true);
    int end = Search(nums, target, false);
    ans[0] = start;
    ans[1] = end;
    return ans;
  }

  static int Search(int[] nums, int target, boolean findStartIndex) {
    int ans = -1;
    int start = 0;
    int end = nums.length - 1;
    //find middle element
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target < nums[mid]) {
        end = mid - 1;
      } else if (target > nums[mid]) {
        start = mid + 1;
      } else {
        //potential answer
        ans = mid;
        if (findStartIndex) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return ans;
  }
}
