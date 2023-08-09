Second Largest Element
  Given an integer array nums return the second largest element from the array.

Example 1:

Input: nums = [5, 1, 4, 6, 6] 
Output: 5
Explanation: 5 is the second largest element from an array.
Example 2:

Input: nums = [-2, -3 , -1, 1] 
Output: -1
Explanation: -1 is the second largest element from an array.

  CODE--------------------------------------------------------------------------------

class Solution {
	public int secondLargest(int[] nums) {
		// Your code goes here
        int largest=nums[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>secondLargest &&  nums[i]!=largest){
                secondLargest=nums[i];
            }
        }
        return secondLargest;
	}
}
