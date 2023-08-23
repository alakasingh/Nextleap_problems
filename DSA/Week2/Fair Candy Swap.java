Fair Candy Swap

  Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.

Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.

Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them. It is guaranteed that at least one answer exists.

Example 1:

Input: aliceSizes = [1,1], bobSizes = [2,2] 
Output: [1,2]
Explanation: 
Example 2:

Input: aliceSizes = [1,2], bobSizes = [2,3] 
Output: [1,2]
Explanation: 
Constraints:

1 <= aliceSizes.length, bobSizes.length <= 
1
0
4
10 
4
 
1 <= aliceSizes[i], bobSizes[j] <= 
1
0
5
10 
5
 
Alice and Bob have a different total number of candies.
There will be at least one valid answer for the given input.
  code------------------------------------------------------------------------------------------
  class Solution {
	public int[] fairCandySwap(int[] A, int[] B) {
		// Your code goes here
        int sa = 0, sb = 0;  // sum of A, B respectively
        for (int x : A) sa += x;  // Calculate the sum of elements in array A
        for (int x : B) sb += x;  // Calculate the sum of elements in array B
        int delta = (sb - sa) / 2;  // Calculate the difference in sums and divide by 2
        // If Alice gives x, she expects to receive x + delta

        Set<Integer> setB = new HashSet();
        for (int x : B) setB.add(x);  // Create a HashSet containing elements from array B

        for (int x : A)
            if (setB.contains(x + delta))  // Check if x + delta exists in setB
                return new int[]{x, x + delta};  // If found, return the pair [x, x + delta]

        throw null;  // This line should never be reached if a valid solution exists
 
	}
}
