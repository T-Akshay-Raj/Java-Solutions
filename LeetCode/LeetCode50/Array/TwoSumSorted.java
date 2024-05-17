package LeetCode.LeetCode50.Array;
/*2. Two Sum(Sorted Array): Difficulty: Medium, Frequency: Medium
LeetCode URL: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.

Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

Example 2:
Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].

Example 3:
Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].


Constraints:

2 <= numbers.length <= 3 * 104
-1000 <= numbers[i] <= 1000
numbers is sorted in non-decreasing order.
-1000 <= target <= 1000
The tests are generated such that there is exactly one solution.

 */
import java.util.Arrays;

public class TwoSumSorted {

  public static void main(String[] args) {

    int[] arr = new int[] {3, 5, 8, 10, 15, 32, 43, 84, 92};
    //Testcase 1:
    int[] res = twoSumSorted(arr, 50);
    System.out.println(Arrays.toString(res));//[0,0]

    //Testcase 2:
    int[] res1 = twoSumSorted(arr, 40);
    System.out.println(Arrays.toString(res1));//[2,5]
  }

  //Using Two Pointer Approach: O(n) runtime, O(1) space
  private static int[] twoSumSorted(int[] arr, int target) {
    int i = 0, j = arr.length - 1;
    while (i < j) {
      int sum = arr[i] + arr[j];
      if (sum == target) {
        return new int[] {i, j};
      } else if (sum < target) {
        i++;
      } else {
        j--;
      }

    }
    return new int[2];
  }

}
