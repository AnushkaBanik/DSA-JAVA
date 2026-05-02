//without use Sorting
import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int left = 0, right = n - 1;
        int k = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                res[k--] = leftSq;
                left++;
            } else {
                res[k--] = rightSq;
                right--;
            }
        }

        return res;
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted integers (separated by space):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = sol.sortedSquares(nums);
        System.out.println("Sorted Squares: " + Arrays.toString(result));

        sc.close();
    }
}
