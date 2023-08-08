Three Divisors
  Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.

An integer m is a divisor of n if there exists an integer k such that n = k * m.

Example 1:

Input: n = 2 
Output: false
Explanation:  2 has only two divisors: 1 and 2.
Example 2:

Input: n = 4 
Output: true
Explanation: 4 has three divisors: 1, 2, and 4.

  CODE--------------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public boolean isThree(int n) {
        int count=0;
        for(int m=1;m<=n;m++){
            if(n%m==0){
                count++;
            }
        }
        if(count==3){
            return true;
        }else return false;
    }
}

Question link - https://leetcode.com/problems/three-divisors/submissions/
