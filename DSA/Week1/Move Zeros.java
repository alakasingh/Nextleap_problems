Move Zeros
  "Given an array A[] of size N containing non-negative integers. You have to move all 0's to the end of array while maintaining the relative order of the non-zero elements.

Note:

You must do this in-place without making a copy of the array.

Minimize the total number of operations."

Example 1:

Input: nums = [0,1,0,3,12] 
Output: [1,3,12,0,0]
Explanation: 
code--------------------------------------------------------------------------------------
  class Solution {
	public int[] moveZeros(int[] nums) {
		// Your code goes here
        
        int nonZeroPointer = 0;

        // Move all non-zero elements to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroPointer] = nums[i];
                nonZeroPointer++;
            }
        }

        // Fill the remaining elements with 0
        while (nonZeroPointer < nums.length) {
            nums[nonZeroPointer] = 0;
            nonZeroPointer++;
        }
      return nums;

	}
}
