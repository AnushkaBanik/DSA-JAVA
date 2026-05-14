
import java.util.*;
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int low=0;
        int high=k-1;
        int sum=0;
        int res= Integer.MIN_VALUE;
        for(int i=low;i<=high;i++ ){
          sum=sum+arr[i];
        }
        res=sum;
        while(high<n){
            low++;
            high++;
            if(high==n)
              break;
            sum=sum+arr[high]-arr[low-1];
            res=Math.max(res,sum);
        }
        return res;
    }
}