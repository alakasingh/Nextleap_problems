Second Smallest Element In Array
  Given an array of integer nums . Find the second smallest element from an array.

Example 1:

Input: nums = [1,2,1,4,6] 
Output: 2
Explanation: 2 is the second smallest element from an array.
  code---------------------------------------------------------------------------------
  class Solution {
	public int secondSmallest(int[] nums) {
		// Your code goes here
        int smallest=nums[0];
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<smallest){
                smallest=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<secondSmallest &&  nums[i]!=smallest){
                secondSmallest=nums[i];
            }
        }
        return secondSmallest;
	}
}
