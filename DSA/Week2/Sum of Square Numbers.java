Sum of Square Numbers
 Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

Example 1:

Input: c = 5 
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:

Input: c = 3 
Output: false
Explanation: 
Constraints:

0 <= c <= 
2
31
−
1
2 
31
 −1

  code---------------------------------------------------------------------------

  class Solution {//O(LOG N)
    private boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
	public boolean judgeSquareSum(int c) {
		// Your code goes here
        for (int a = 0; a <= Math.sqrt(c); a++) {
         int bSquared = c - a * a;
            if (isPerfectSquare(bSquared)) {
                return true;
            }
        }
        return false;
	}
}
