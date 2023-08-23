Capacity To Ship Packages Within D Days
  A conveyor belt has packages that must be shipped from one port to another within days days.

The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

Example 1:

Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5 
Output: 15
Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:

1st day: 1, 2, 3, 4, 5

2nd day: 6, 7

3rd day: 8

4th day: 9

5th day: 10

Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
Example 2:

Input: weights = [3,2,2,4,1,4], days = 3 
Output: 6
Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:

1st day: 3, 2


2nd day: 2, 4


3rd day: 1, 4


Example 3:

Input: weights = [1,2,3,1,1], days = 4 
Output: 3
Explanation: 1st day: 1

2nd day: 2


3rd day: 3


4th day: 1, 1

  code----------------------------------------------------------------------

class Solution {
    public static int findNoOfDay(int weights[] , int capcity){
           //STEP 1(A)- INITIALIZE LOAD AS 0 BECAUSE SHIP IS NO LOADED AT    
                     //START AND DAY IS ONE
           int load=0;
           int day=1;
           int n=weights.length;
           //STEP 1(B)- ITREAT THE LOOP FOR ALL THE WEIGHT
           for(int i=0;i<n;i++){
           //STEP 1(C)- IF SUM OF LOAD AND VALUE OF CURRENT WEIGHT IS GREATER
                       //THAN CAPCITY SO WE WILL ADD DAY AS DAY+1 AND   
                       //INIALIZE LOAD AS NEW WEIGHT OR CURRENT WEIGHT
           if(load+weights[i]>capcity){
               day=day+1;
               load=weights[i];
           }//STEP 1(D)- IF TILL ABOVE CONDITION NOT SATICFIDE ADD THE ALL 
             //WEIGHT IN THE LOAD
           else{
               load+=weights[i];
           }
        }//STEP 1(E)-AFTER ITERATOR ALL THE VALUES WE FOUND OUT OUR DAY     
         //AND JUST RETURN IT
        return day;

    }
    //PROGRAM START HERE
    public int shipWithinDays(int[] weights, int days) {
        //STEP 1-FIND LOWEST CAPCITY OF WEIGHTS
                //FOR EXAMPLE - [1,2,3,4,5,6,7,8,9,10]  
                //ABOVE WEIGHT ARRAY LOWEST CAPCITY IS 10 (ALSO MAX ELEMENT)
                //SO WE CHOOSE IS LOWEST AS 10
                //-WHY WE CHOOSE LOWEST AS 10 WE ALSO CHOOSE 1 OR 2 OR MORE
                //WHY ONLY 10 - IF WE TAKE LOWEST VALUE LESS THAN 10
                //WE ARE NOT ABLE TO SHIPPED 10 WEIGHT OF PACKAGE

        //STEP 2-FIND AT LAST RANGE 
                //SO LAST RANGE POSSIBLE START FROM 10 TO GRATER THAN 10
                //BUT HERE WE FOUND HOW CAPCITY WE REQUIRED TO ALL THE
                //PACKAGES SHIPPED IN ONE DAY
                //FOR THAT WE ADD ALL THE WEIGHT IN ARRAYT
                //WE ALSO USE THIS FORMULA (N*(N+1)/2)FOR CALCULATING sumOfal

        int low=Integer.MIN_VALUE;
        int high=0;
        for(int num : weights){
            if(num>low){
               low=num; 
            }
           high+=num;
        }
        //STEP 3- CHECK THE LOW LESS THAN EQUAL TO HIGH
        while(low<=high){   
        //STEP 4- FIND MID VALUE OF CAPCITY , CHACK FOR LEAST CAPCITY
        int mid=(low+high)/2;
        //STEP 5- CREATE ANOTHER FUNCTION FOR CALCULATING NUMBER 
                  //OF DAY USING ARRAY OF WEIGHT AND MIF(CAPCITY) 
        int numberOfDay = findNoOfDay(weights,mid);
        //STEP 6- NUMBER OF DAY IS LESS THAN TARGET  
        if(numberOfDay <= days){
            //IF YES JUST DECREAS HIGH AS MID-1 BECAUSE WE WANT LEAST 
            high=mid-1;
        }else{
            //IF NO JUST INCREASE LOW AS MID+1 
            low=mid+1;
        }
    }   //STEP 7- WE SIMPLEY  RETURN LOW 
        //WHY HERE RETURN LOW THINK OUT??
        return low;
    }
}
