import java.util.*;

class Solution {

    public int[] twoSum(int[] numbers, int target) {
    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0;i<numbers.length;i++)
    {
        int diff = target - numbers[i];
        if (map.containsKey(diff)){ //check if needed number already exists
           return new int[]{map.get(diff),i};
        }
    map.put(numbers[i], i);
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