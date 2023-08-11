Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
  Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.

 

Example 1:

Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).

  CODE------------------------------------------------------------

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowSum=0,ans=0;
        for(int i=0;i<k;i++) {
            windowSum+=arr[i];
        }
        if(windowSum>=threshold*k) ans++;
        for(int i=k;i<arr.length;i++) {
            windowSum+=arr[i];
            windowSum-=arr[i-k];
            if(windowSum>=threshold*k) ans++;
        }
        return ans;


    }
}
