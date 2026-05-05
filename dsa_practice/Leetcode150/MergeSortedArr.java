//Merge Two Sorted Array Approach : Two Pointer (three pointer) from backward
import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // pointer for last valid element in nums1
        int j = n - 1; // pointer for last element in nums2
        int k = m + n - 1; // pointer for last position in nums1

        // Merge in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If elements remain in nums2, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter number of elements in nums1 (m): ");
        int m = sc.nextInt();
        System.out.print("Enter total capacity of nums1 (m+n): ");
        int total = sc.nextInt();
        
        int[] nums1 = new int[total];
        System.out.println("Enter " + m + " sorted elements for nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter number of elements in nums2 (n): ");
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter " + n + " sorted elements for nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Call merge
        sol.merge(nums1, m, nums2, n);

        System.out.println("Merged Array: " + Arrays.toString(nums1));
        sc.close();
    }
}