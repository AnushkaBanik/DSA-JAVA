Probblem:977(Squares of a Sorted Array)

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]

Approach: Brute Force
Time Complexity:O(nlogn)[cause we know that for using sort method it will become O(nlogn)]
Space Complexity:O(1)
i use Arrays.sort() after sq. of each number thats why TC is O(nlogn).



problem: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?

 Notes: Don't do sorting in the program if needed.we returnd sorted array as a result but without use sorting then TC and SC become O(n).

Example:
Input: nums = [-4,-1,0,3,10]
after sq.= [16,1,0,9,100] but actual
Output: [0,1,9,16,100]

Explanation:
The input array is already sorted. However, negative numbers become large positives when squared (e.g., -4 becomes 16) so the largest squares are guaranteed to be at the extreme ends (leftmost or rightmost), allowing for a linear, non-sorting approach.

Approach: Two Pointer
Time Complexity: O(n)
Space Complexity: O(n)
