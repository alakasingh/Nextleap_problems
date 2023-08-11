3Sum
  Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
code-----------------------------------------------
  class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int a=nums[i];  
            int t=-a;
            int s=i+1,e=n-1;
            while(s<e)
            {
                if(nums[s]+nums[e]==t)
                {
                    ArrayList<Integer> arr = new ArrayList<>(List.of(nums[i],nums[s],nums[e]));
                    ans.add(arr);
                    while(s<e&&nums[s]==nums[s+1])s++;
                    while(s<e&&nums[e]==nums[e-1])e--;
                    s++;
                    e--;
                }
                else if(nums[s]+nums[e]>t)
                {
                    e--;
                }
                else
                {
                    s++;
                }
            }
            while(i+1<n&&nums[i+1]==nums[i])i++;
        }
        return ans;
    }
}
