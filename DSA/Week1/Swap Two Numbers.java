Swap Two Numbers
  Given a two numbers num1 and num2 . Write a program to swap two numbers.

Example 1:

 Input: num1=100 , num2=50
 Output: num1=50 , num2=100
 After swapping num1 becomes 50 and num2 becomes 100 
  CODE--------------------------------------------------------------------------------------------------------------------------------

  class Solution{
    public List<Integer> swapNumbers(int a, int b) {
        // Your code goes here
        a=a^b;
        b=a^b;
        a=a^b;
         List<Integer> result = new ArrayList<>();
        result.add(a);
        result.add(b);
        return result;
    }

}
Question link - 
