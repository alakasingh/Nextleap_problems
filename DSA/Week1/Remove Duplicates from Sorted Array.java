Remove Duplicates from Sorted Array
  Given an integer array nums sorted in non-decreasing order, remove the duplicates  such that each unique element appears only once and return the new array.

Example 1:

Input: nums = [1,1,2] 
Output: [1,2]
Explanation: Array after removing duplicates are [1,2]
  code-----------------------------------------------------------------------
  import java.util.ArrayList;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		int count=0;
		for(int i=0; i<n-1 ; i++){
			if(){
				continue;
			}
			arr[count] = nums[i];
			count++;
			
		}

		 arr[count] = nums[n - 1];
        count++;


		int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = arr[i];
        }

        return result;
	}
}
