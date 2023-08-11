Sort Colors
  Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0] 
Output: [0,0,1,1,2,2]
Explanation: 

code--------------------------------------------------------------------
  public class Solution {
    public void sortColors(int[] nums) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) cnt0++;
            else if (nums[i] == 1) cnt1++;
            else cnt2++;
        }

        // Replace the places in the original array:
        for (int i = 0; i < cnt0; i++) nums[i] = 0; // replacing 0's

        for (int i = cnt0; i < cnt0 + cnt1; i++) nums[i] = 1; // replacing 1's

        for (int i = cnt0 + cnt1; i < nums.length; i++) nums[i] = 2;
    }
}
