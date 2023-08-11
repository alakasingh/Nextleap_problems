Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:

Input: nums = [3,0,1] 
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

  code-------------------------------------

  class Solution {
    public int missingNumber(int[] nums) {

        int n=nums.length;
        int sum1=(n*(n+1))/2;
         int sum2=0;
        for(int i=0;i<n;i++){
            
            sum2=sum2+nums[i];
            
        }

        return sum1-sum2;
        
    }
}
