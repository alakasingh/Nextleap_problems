Maximum Difference of zeros and ones in a Binary String
  Given a binary string s of 0's and 1's. The task is to find the maximum difference between the number of 0s and the number of 1s (number of 0s — number of 1s) for a substring . In case of all 1s print -1.

Example 1:

Input: s = "11000010001" 
Output: 6
Explanation: From index 2 to index 9, there are 7

0s and 1 1s, so number of 0s - number

of 1s is 6.

  code-----------------------------------------------------------

  class Solution {
  public int getMaxDifference(String str) {
    int n = str.length();
    int current_sum = 0;
    int max_sum = 0;
    // traverse a binary string from left to right
    for (int i = 0; i < n; i++) {

      // add current value to the current_sum
      // according to the Character
      // if it's '0' add 1 else -1
      current_sum += (str.charAt(i) == '0' ? 1 : -1);

      if (current_sum < 0)
        current_sum = 0;

      // update maximum sum
      max_sum = Math.max(current_sum, max_sum);
    }
    // return -1 if string does not contain any zero
    // that means string contains all ones otherwise max_sum
    return max_sum == 0 ? -1 : max_sum;
  }
}
