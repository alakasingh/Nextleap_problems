Single Number
  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1] 
Output: 1
Explanation: 
Example 2:

Input: nums = [4,1,2,1,2] 
Output: 4
Explanation: 
Example 3:

Input: nums = [1] 
Output: 1
Explanation: 

code---------------------------------------------------------------

  class Solution {
	public int singleNumber(int[] nums) {
		// Your code goes here
        int ans=0;
        for(int num:nums){
            ans^=num;
        }
        return ans;
	}
}
