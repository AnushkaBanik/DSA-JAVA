Name : this is a Dutch National Flag Algorithom problem.
Problem Name: Sort Colors [leetcode: 75]

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Without Sorting Aprroach:{u can solve this by three way - brute force, two pass solution[best] and single pass solution[best].(this is also called Dutch National Flag Algorithom solution .)}
 we use Single pass (two pointer or u can say its three pointer approach)

 Notes:
 What is a "Traversal"?->Traversal means:Visiting elements of a data structure one by one.
 What is a "Pass"?->A pass means:One complete traversal over the data structure.
    example: Two pass Solution 
      pass 1 - count 0s,1s and 2s(count frequencies)
      pass 2 - Rewrite array(rewrite sorted values)
    that means first full traversal + second full traversal

    single pass (Dutch National Flag Solution):solve in one scan or traversal.

Explaination of SIngle-Pass Solution:(Three pointer Approach)
1. We have only: 0, 1, 2 so Need:0s first,1s middle,2s last but WITHOUT sorting [We are actively placing 0s to the left, actively placing 2s to the right And because of that,everything left in the middle automatically becomes 1]
2. set Regions:
 0 → low-1       = all 0s
low → mid-1     = all 1s
mid → high      = unknown
high+1 → end    = all 2s
3. If nums[mid] == 0 then Put it in front.
    swap(low, mid);
    low++;
    mid++;
   If nums[mid] == 1 
     mid++;
     (That means:this element belongs in middle region  And the middle region is exactly:low → mid-1)
   If nums[mid] == 2 then Put it at end.
     swap(mid, high);
     high--;

Time complexity:O(n) for Both Single pass Solution and two pass solution
Space complexity:O(1) for Both Single pass Solution and two pass solution