import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {  
     for (int i=0;i<nums.length;i++) {
         nums[i]=nums[i]*nums[i];
     }
     Arrays.sort(nums);
     return nums;  
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