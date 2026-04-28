import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i=0;
        int count=1;
        int j=1;
        int n= nums.length;
        while(j<n)
        {
            if (nums[j]==nums[j-1]){
                 j++;
                continue;
            }
            nums[i+1]=nums[j];
             i++;
             count++;
             j++;
           
        }
        return count;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();

        System.out.print("Enter the number of elements in the sorted array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " sorted integers:");
        for (int k = 0; k < n; k++) {
            nums[k] = sc.nextInt();
        }

        int k = obj.removeDuplicates(nums);

        System.out.println("\nNumber of unique elements: " + k);
        System.out.print("Modified array (first " + k + " elements): ");
        for (int m = 0; m < k; m++) {
            System.out.print(nums[m] + " ");
        }
        
        sc.close();
    }
}