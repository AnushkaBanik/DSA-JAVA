PROBLEM: Leetcode 15 [3sum problemm]

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Approach: Two Pointer

Explaination:
1.Sort the array 
2.fix one element(i) which run till < n-2 cause i != left, left != right, i != right
3.Use two pointers (left, right) to find pairs such that: nums[i] + nums[left] + nums[right] == 0
 ->that means : nums[left] + nums[right] = - nums[i]

 Time Complexity: O(n^2)
 Space Complexity: O(1)[excluding result array]