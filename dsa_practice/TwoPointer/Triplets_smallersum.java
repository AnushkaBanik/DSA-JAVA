import java.util.*;
class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
         Arrays.sort(arr);
      
        int n = arr.length;
        int count=0;
        //i is the fix element
        for (int i = 0; i < n - 2; i++) {
         
          int left = i+1;
          int right = n - 1;
      
          while (left < right) {
            int total = arr[i] + arr[left] + arr[right];
            if (total < sum) {
                count=count+(right-left);
                left++;
            } else {
                right--;
            }
          }
        }
        return count;   
    }
}