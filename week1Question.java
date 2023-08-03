Write a code to print multiple lines. First line should print "Hello there!" followed by second line "Let's start".

Example 1:

Output: Hello there!
Let's start
Explanation: Output printed in a separate line

CODE-------------------------------------------------------------------------------
class Solution:
	def printTwoLines(self):
		print("Hello there!")
		print("Let's start")
----------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the + operator to add two numbers and returns the result.

Example 1:

Input: a = 1, b = -1 
Output: 0
Explanation: 

code------------------------------------------------------------------------------
class Solution {
	public int addTwoNumbers(int a, int b) {
		return a+b;
	}
}
--------------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the && operator to check if two variables are true and returns the result.

Example 1:

Input: a = true, b = true 
Output: true
Explanation: 

code-----------------------------------------------------------------------------
class Solution {
	public boolean checkboolean(boolean a, boolean b) {
		return a && b;
	}
}
-------------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the > operator to check if one number (a) is greater than another (b) and returns the result.

Example 1:

Input: a = 5, b = 3 
Output: true
Explanation: 
code-----------------------------------------------------------------------------
class Solution {
	public boolean checkGreater(int a, int b) {
		return a > b;
	}
}
-------------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the * operator to multiply two numbers and returns the result.

Example 1:

Input: a = 3, b = 5 
Output: 15
Explanation: 
code-----------------------------------------------------------------------------
class Solution {
	public int multiplyTwoNumbers(int a, int b) {
		 return a * b;
	}
}
---------------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the || operator to check if at least one of two variables is true and returns the result.

Example 1:

Input: a = true, b = true 
Output: true
Explanation: 
code---------------------------------------------------------------------------
class Solution {
	public boolean checkAtLeastOneTrue(boolean a, boolean b) {
		return a || b;
	}
}
----------------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the - operator to subtract one number from another and returns the result.

Example 1:

Input: a = 5, b = 2 
Output: 3
Explanation: 
code--------------------------------------------------------------------------
class Solution {
	public int subtractTwoNumbers(int a, int b) {
		return a-b;
	}
}
-----------------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the == operator to check if two variables have the same value and returns the result.

Example 1:

Input: a = 5, b = 5 
Output: true
Explanation: 
code------------------------------------------------------------------------
class Solution {
	public boolean checkSameValue(int a, int b) {
		return a==b;
	}
}
-----------------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the < operator to check if one number is less than another and returns the result.

Example 1:

Input: a = 5, b = 10 
Output: true
Explanation: 
code-------------------------------------------------------------------------
class Solution {
	public boolean checkLessThan(int a, int b) {
		return a<b;
	}
}
-----------------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the / operator to divide one number by another and returns the result.

Example 1:

Input: a = 10, b = 2 
Output: 5.00000
Explanation: 
code------------------------------------------------------------------------
class Solution {
	public double divideNumbers(double a, double b) {
		return a/b ;
	}
}
-----------------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the != operator to check if two variables have different values and returns the result.

Example 1:

Input: a = 3, b = 3 
Output: false
Explanation: 
code-----------------------------------------------------------------------
class Solution {
	public boolean checkNotEqual(int a, int b) {
		return a != b;
	}
}
-----------------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the % operator to find the remainder when one number is divided by another and returns the result.

Example 1:

Input: a = 11, b = 3 
Output: 2
Explanation: 
-------------------------------------------------------------------------
class Solution {
	public int findRemainder(int a, int b) {
		return a % b;

	}
}
-----------------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the ++ operator to increment a number by 1 and returns the result.

Example 1:

Input: a = 2 
Output: 3
Explanation: 
code--------------------------------------------------------------------
class Solution {
	public int incrementByOne(int a) {
		return ++a;
	}
}
---------------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the -- operator to decrement a number by 1 and returns the result.

Example 1:

Input: a = 5 
Output: 4
Explanation: 
code--------------------------------------------------------------------
class Solution {
	public int decrementByOne(int a) {
		return --a;
	}
}
----------------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the += operator to add a value to a variable and returns the result.

Example 1:

Input: a = 5, b = 2 
Output: 7
Explanation: 
code---------------------------------------------------------------------
class Solution {
	public int addValueToVariable(int a, int b) {
		return a += b;
	}
}
------------------------------------------------------------------------------------------------------------------------------------------

Write a program that uses the *= operator to multiply a variable by a value and returns the result.

Example 1:

Input: a = 3, b = 4 
Output: 12
Explanation: 
code---------------------------------------------------------------------
class Solution {
	public int multiplyVariableByValue(int a, int b) {
		return a *= b;
	}
}
------------------------------------------------------------------------------------------------------------------------------------------

Given the length of side of a square, calculate its area.

Example 1:

Input: side = 10 
Output: 100.00000
Explanation: 
code---------------------------------------------------------------------
class Solution {
	public double areaOfSquare(double side) {
		return side * side;
	}
}
---------------------------------------------------------------------------------------------------------------------------------------------

Find the N-th term in an Arithmetic Progression. Given ,

a - first term,
d - common difference
n - Specifying N
More about Arithmetic Progression here

Example 1:

Input: a = 1, d = 1, n = 10 
Output: 10
Explanation: 
code-------------------------------------------------------------------
class Solution {
	public int nthTermInAnAP(int a, int d, int n) {
		return a + (n - 1) * d;
	}
}
-----------------------------------------------------------------------------------------------------------------------------------------------

Write a function calculateCircleArea that takes in a radius r and returns the area of a circle with that radius.

Example 1:

Input: r = 2.00000 
Output: 12.56637
Explanation: 
code----------------------------------------------------------------
class Solution {
	public double calculateCircleArea(double r) {
		double area = r * r * Math.PI;
       return area;
	}
}
----------------------------------------------------------------------------------------------------------------------------------------------
Write a function convertFahrenheitToCelsius that takes in a temperature in degrees Fahrenheit and returns the equivalent temperature in degrees Celsius.

The conversion formula is:

C=(F−32)∗(5/9)

where C is the temperature in degrees Celsius and F is the temperature in degrees Fahrenheit.

Example 1:

Input: tempF = 32 
Output: 0.00000
Explanation: 
code----------------------------------------------------------------
class Solution {
	public double convertFahrenheitToCelsius(double tempF) {
		return (tempF - 32) * (5d/9d);
	}
}
--------------------------------------------------------------------------------------------------------------------------------------------------
Write a function calculateCylinderVolume that takes in the following parameters:

radius: the radius of the base of the cylinder

height: the height of the cylinder

The function should return the volume of the cylinder.

Example 1:

Input: radius = 2, height = 5 
Output: 62.83185
Explanation: 
code-------------------------------------------------------------
class Solution {
	public double calculateCylinderVolume(double radius, double height) {
		return Math.PI * radius * radius * height;
	}
}
--------------------------------------------------------------------------------------------------------------------------------------------------
Write a function that takes in a string representation of a boolean and returns the boolean value.

Example 1:

Input: str = "true" 
Output: true
Explanation: 
code------------------------------------------------------------
class Solution {
	public boolean stringToBoolean(String str) {
		return "true".equalsIgnoreCase(str);
	}
}
---------------------------------------------------------------------------------------------------------------------------------------------------
Write a function that takes in a number and returns it as a string.

Example 1:

Input: num = 42 
Output: "42"
Explanation: 
code------------------------------------------------------------
class Solution {
	public String intToString(int num) {
		return String.valueOf(num);
	}
}

