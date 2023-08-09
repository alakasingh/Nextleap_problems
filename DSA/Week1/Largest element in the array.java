Given an array nums of n integers . Find the maximum number from an array.

Example 1:

Input : nums=[1,20,-10,30]
Output: 30
The maximum element from an array is 30
Example 2:

Input: nums=[-10,-20,0,-30,5]
Output:5
  CODE---------------------------------------------------------------------------------------------------

  class Solution {
    public int findLargestElement(int []nums) {
        // Your code goes here
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }

        }return max;
    }
}
