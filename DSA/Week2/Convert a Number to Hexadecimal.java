Convert a Number to Hexadecimal
Given an integer num, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.

All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.

Note: You are not allowed to use any built-in library method to directly solve this problem.

Example 1:

Input: num = 26 
Output: "1a"
Explanation: 
Example 2:

Input: num = -1 
Output: "ffffffff"
Explanation: 

code--------------------------------------------------------

class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        
        char hexchars[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder hex = new StringBuilder();
        
        while (num != 0) {
            int rem = num & 0xf; // Get the last 4 bits
            hex.insert(0, hexchars[rem]);
            num >>>= 4; // Move to the next 4 bits
        }
        
        return hex.toString();
    }
}
