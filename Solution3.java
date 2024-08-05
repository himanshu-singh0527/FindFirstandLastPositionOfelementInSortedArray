import java.util.*;
public class Solution3 {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int  last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first, last};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        Solution solution = new Solution();
        int[] result = solution.searchRange(nums, target);
        System.out.println("First and last positions of target in array:" +result);
    }
}