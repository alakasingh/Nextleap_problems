Smallest Element In Array
  Given an array of integers . Find the smallest element in the array.

Example 1:

Input: nums = [-10,1,5,6,-11] 
Output: -11
Explanation: Smallest element is -11.
  CODE------------------------------------------------------
  class Solution {
	public int findSmallest(int[] nums) {
		// Your code goes here
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }

        }return min;
	}
}
