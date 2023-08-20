Majority Element
  Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3] 
Output: 3
Explanation: 
Example 2:

Input: nums = [2,2,1,1,1,2,2] 
Output: 2
Explanation: 

code--------------------------------------------------------------------

class Solution {
   

    public int majorityElement(int[] nums) {
        int a = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        for (int i = 0; i <= nums.length - 1; i++) {
            if (hm.get(nums[i]) > nums.length / 2) {
                a = nums[i];
            }
        }
        return a;
    }
}
