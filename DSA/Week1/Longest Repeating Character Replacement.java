Longest Repeating Character Replacement
  You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.

Example 1:

Input: s = "ABAB", k = 2 
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
Example 2:

Input: s = "AABABBA", k = 1 
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".

The substring "BBBB" has the longest repeating letters, which is 4.

  code--------------------------------------------------------------------------------------------------------

class Solution {
    public int characterReplacement(String s, int k) {
        // binary search over the length of substring
        // lo contains the valid value, and hi contains the
        // invalid value
        int lo = 1;
        int hi = s.length() + 1;

        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;

            // can we make a valid substring of length `mid`?
            if (canMakeValidSubstring(s, mid, k)) {
                // explore the right half
                lo = mid;
            } else {
                // explore the left half
                hi = mid;
            }
        }

        // length of the longest substring that satisfies
        // the given condition
        return lo;
    }

    private Boolean canMakeValidSubstring(
            String s,
            int substringLength,
            int k) {
        // take a window of length `substringLength` on the given
        // string, and move it from left to right. If this window
        // satisfies the condition of a valid string, then we return
        // true

        int[] freqMap = new int[26];
        int maxFrequency = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end += 1) {
            freqMap[s.charAt(end) - 'A'] += 1;

            // if the window [start, end] exceeds substringLength
            // then move the start pointer one step toward right
            if (end + 1 - start > substringLength) {
                // before moving the pointer toward right, decrease
                // the frequency of the corresponding character
                freqMap[s.charAt(start) - 'A'] -= 1;
                start += 1;
            }

            // record the maximum frequency seen so far
            maxFrequency = Math.max(maxFrequency, freqMap[s.charAt(end) - 'A']);
            if (substringLength - maxFrequency <= k) {
                return true;
            }
        }

        // we didn't a valid substring of the given size
        return false;
    }
}
