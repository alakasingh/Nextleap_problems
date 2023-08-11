Find All Anagrams in a String
  Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "cbaebabacd", p = "abc" 
Output: [0,6]
Explanation: The substring with start index = 0 is "cba", which is an anagram of "abc".

The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab" 
Output: [0,1,2]
Explanation: The substring with start index = 0 is "ab", which is an anagram of "ab".

The substring with start index = 1 is "ba", which is an anagram of "ab".


The substring with start index = 2 is "ab", which is an anagram of "ab".

  CODE-----------------------------------------------------------------------------------------------------

  class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        Map<Character, Integer> charCountP = new HashMap<>();
        for (char c : p.toCharArray()) {
            charCountP.put(c, charCountP.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int count = charCountP.size();

        while (right < s.length()) {
            char charRight = s.charAt(right);
            if (charCountP.containsKey(charRight)) {
                charCountP.put(charRight, charCountP.get(charRight) - 1);
                if (charCountP.get(charRight) == 0) {
                    count--;
                }
            }
            right++;

            while (count == 0) {
                if (right - left == p.length()) {
                    result.add(left);
                }

                char charLeft = s.charAt(left);
                if (charCountP.containsKey(charLeft)) {
                    charCountP.put(charLeft, charCountP.get(charLeft) + 1);
                    if (charCountP.get(charLeft) > 0) {
                        count++;
                    }
                }
                left++;
            }
        }

        return result;
    
    }
}
