import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
      
        int n = nums.length;
        int closest = nums[0] + nums[1] + nums[2];
        //i is the fix element
        for (int i = 0; i < n - 2; i++) {
          int left = i+1;
          int right = n - 1;
      
          while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            // update closest
            if (Math.abs(sum - target) < Math.abs(closest - target)) {
                 closest = sum;
            }
            if (sum == target) {
              return sum;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
          }
        }
        return closest;   
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
         int target = sc.nextInt();
         int result = sol.threeSumClosest(nums,target);
        System.out.println("Triplets sum closest to target: " + result);
        
        sc.close();
    }
    
}
