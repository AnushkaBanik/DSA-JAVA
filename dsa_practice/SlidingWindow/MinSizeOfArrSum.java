import java.util.*;
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int n = nums.length;
        int low=0;
        int sum=0;
        int res= Integer.MAX_VALUE;
        for(int high=0;high<n;high++ ){
            //Expand window
          sum=sum+nums[high];
          //Shrink window while valid
          while(sum>=target){
            //Update minimum length
            int len= high-low+1;
            res=Math.min(res,len);
            sum=sum-nums[low];
            low++;
          }
        }
        //If no such subarray exists, return 0.
        if(res == Integer.MAX_VALUE) 
            return 0;
        else 
            return res;
        
    }
}