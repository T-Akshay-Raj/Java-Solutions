package DataStructures.Arrays;

import java.util.Arrays;

/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

Constraints:
1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
 */
public class RunningSumOf1dArray {
  public static void main(String[] args) {
    Solution sol = new Solution();
    int a[] = {1, 2, 3, 4};
    int b[] = {1, 1, 1, 1, 1};
    int c[] = {3, 1, 2, 10, 1};
    int d[]=new int[0];

    System.out.println(Arrays.toString(sol.runningSum(a))); //[1,3,6,10]
    System.out.println(Arrays.toString(sol.runningSum(b))); // [1,2,3,4,5]
    System.out.println(Arrays.toString(sol.runningSum(c)));//    [3,4,6,16,17]
    System.out.println(Arrays.toString(sol.runningSum(d))); //  []

//Approach 2:
    System.out.println(Arrays.toString(sol.runningSum1(a))); //[1,3,6,10]
    System.out.println(Arrays.toString(sol.runningSum1(b))); // [1,2,3,4,5]
    System.out.println(Arrays.toString(sol.runningSum1(c)));//    [3,4,6,16,17]
    System.out.println(Arrays.toString(sol.runningSum1(d))); //  []

  }
}

class Solution {
  public int[] runningSum(int[] nums) {
    int[] res = new int[nums.length];
     if (nums.length>0){ res[0] = nums[0];}else{ return new int[0];}//handling situation on arrays with zero elements
    for (int i = 1; i < nums.length; i++) {
      res[i] = nums[i] + res[i - 1];
    }
    return res;
  }

  //Approach 2: Without using extra array to store result
  public int[] runningSum1(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      nums[i] = nums[i - 1] + nums[i];
    }
    return nums;
  }
}
