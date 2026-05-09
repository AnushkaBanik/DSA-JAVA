problem:Leetcode 16( 3Sum Closest)

Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

Approach: Two Pointer

Explaination:
1.Sort the array 
2.fix one element(i) which run till < n-2 
3.Use two pointers (left, right)
4.Compute:sum = nums[i] + nums[left] + nums[right]
5.Track the sum whose: abs(sum - target) is minimum

Time Complexity: O(n^2)
Space Complexity: O(1)