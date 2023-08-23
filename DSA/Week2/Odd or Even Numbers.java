Odd or Even Numbers
  Write a program to check if the the given number is odd or even.

Return string "even" if the number is even, "odd" if the number is odd.

Example 1:

Input: num = 4 
Output: "even"
Explanation: 
Example 2:

Input: num = 5 
Output: "odd"
Explanation: 
Constraints:

code--------------------------------------------------------------------------------

class Solution {
	public String checkNumber(int num) {
		// Your code goes here
        if(num%2==0){
            return "even";
        }
        else return "odd";
	}
}
