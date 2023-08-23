Koko Eating Bananas
  Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1:

Input: piles = [3,6,7,11], h = 8 
Output: 4
Explanation: 
Example 2:

Input: piles = [30,11,23,4,20], h = 5 
Output: 30
Explanation: 
Example 3:

Input: piles = [30,11,23,4,20], h = 6 
Output: 23
Explanation: 
Constraints:

1 <= piles.length <= 
1
0
4
10 
4
 
piles.length <= h <= 
1
0
9
10 
9
 
1 <= piles[i] <=
1
0
9
10 
9

  code-----------------------------------------------------------

  class Solution {
     public static int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;;
        int n = v.length;
        //find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }
     public static int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        int n = v.length;
        //find total hours:
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return totalH;
    }
	public int minEatingSpeed(int[] v, int h) {
		// Your code goes here
       int low = 1, high = findMax(v);

        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(v, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
	}
}
