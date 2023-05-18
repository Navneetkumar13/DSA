/* Kadane's Algorithm: Maximum Subarray Sum
Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray.

Approach:
1> Run a loop on the array elements
2> initialize two variables to keep track of current sum and max sum.
3> if th e curr sum becomes negative then that wont be our ans. in that case set the currSum to 0
4> return the maxSum at the end.
*/


class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int currSum = 0;
        for(int i:nums){
            if(currSum<0){
                currSum = 0;
            }
            currSum += i;
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}
