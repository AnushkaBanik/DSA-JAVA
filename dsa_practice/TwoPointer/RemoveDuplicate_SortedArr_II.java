import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums, int d) {
       if(nums.length<=d) return nums.length;
        int i=d; //d=max how many times each elements can repeats
        for(int j=d;j<nums.length;j++){
            if(nums[j]!=nums[i-d]){
               nums[i]=nums[j];
               i++;
            }
            
        }
          return i;
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

        System.out.println("Say max how many times each elements can repeats:");
        int d = sc.nextInt();
        int k = obj.removeDuplicates(nums,d);

        System.out.println("\nNumber of unique elements: " + k);
        System.out.print("Modified array (first " + k + " elements): ");
        for (int m = 0; m < k; m++) {
            System.out.print(nums[m] + " ");
        }
        
        sc.close();
    }
}