import java.util.*;

class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[]{i+1,j+1}; // return indexes+
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{-1, -1};//no pair found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // Input array (must be sorted)
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        Solution obj = new Solution();
        int[] result = obj.twoSum(numbers, target);

        // Output
        if (result[0] == -1) {
            System.out.println("No solution found");
        } else {
            System.out.println("Indices (1-based): " + result[0] + " " + result[1]);
        }

        sc.close();
    }
}