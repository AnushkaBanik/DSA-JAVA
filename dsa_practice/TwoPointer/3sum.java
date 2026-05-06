import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        //i is the fix element
        for (int i = 0; i < n - 2; i++) {
         if (i > 0 && nums[i] == nums[i - 1]) continue;//  // skip duplicate i
         int left = i+1;
         int right = n - 1;
         int target = - nums[i];
         while (left < right) {
            int sum = nums[left] + nums[right];//or we can do nums[i]+nums[left]+nums[right] then check if (sum==0)
            if (sum == target) {
                 res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                 left++;
                 right--;
                 while(left < right && nums[left]==nums[left-1]){
                    left++;}
                 while(left < right && nums[right]==nums[right+1]){
                    right--;}
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
         }
     }
        return res;

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

        List<List<Integer>> result = sol.threeSum(nums);
        System.out.println("Triplets that sum to zero: " + result);
        
        sc.close();
    }
    
}
