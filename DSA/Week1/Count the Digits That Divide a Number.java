Count the Digits That Divide a Number
  Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0

Example 1:

Input: num = 121 
Output: 2
Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
Example 2:

Input: num = 1248 
Output: 4
Explanation: 1248 is divisible by all of its digits, hence the answer is 4.

  CODE-------------------------------------------------------------------------------------------------------------------------------------------

  class Solution {
	public int countDigits(int num) {
		// Your code goes here
         int count = 0;
        int originalNum = num; // Store the original number
        
        while (num > 0) {
            int digit = num % 10;
            
            if (digit!=0 && originalNum % digit == 0) {
                count++;
            }
            
            num /= 10;
        }
        
        return count;
	}
}

Question link - https://leetcode.com/problems/count-the-digits-that-divide-a-number/submissions/
