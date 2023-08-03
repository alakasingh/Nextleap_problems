"You are given a number N. If any digit from 1 to 9 occurs consecutive for more than or equal to 3 times, this number is awesome. 
Example: 12333, 211115, 555 are awesome numbers while 11211, 3456 are not. A number which is not awesome is considered good.

You are given a number N, find out whether it is awesome or good."

Example 1:

Input: n = 12333 
Output: "Awesome"
Explanation: 

code---------------------------------------------------------------------------------------------------------------------------------------

  class Solution {
    public String isAwesome(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2)) {
                return "Awesome";
            }
        }
        return "Good";
    }
}
