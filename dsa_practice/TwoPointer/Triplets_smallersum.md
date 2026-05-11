problem: GFG[Triplets with smaller sum]

Given an array arr[] of distinct integers and a value sum, find the count of triplets (i, j, k), having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.

Examples :

Input: sum = 2, arr[] = [-2, 0, 1, 3]
Output:  2
Explanation: Triplets with sum less than 2 are (-2, 0, 1) and (-2, 0, 3). 

Approach: Two Pointer

Explaination:
1.Sort the array 
2.fix one element(i) which run till < n-2 
3.Use two pointers (left, right)
4.compute: arr[i] + arr[left] + arr[right]<sum
5.  count += (right - left);
Why count += (right - left) ?
Since array is sorted so if If biggest one works then smaller ones also work So we count ALL together.

Time:O(n²)
space:O(1)