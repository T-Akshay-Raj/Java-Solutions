package Array.Easy;
/*
Two Sum(UnSorted Array) : Difficulty: Easy, Frequency : High
Leet Code URL: https://leetcode.com/problems/two-sum/

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static void main(String[] args) {

    int[] arr = new int[] {10, 32, 3, 43, 92, 8, 84, 15, 5};

    //Test case 1:
    int[] res = twoSum(arr, 50);
    System.out.println(Arrays.toString(res));//[0,0]

    //Test case 2:
    int[] res1 = twoSum(arr, 40);
    System.out.println(Arrays.toString(res1));//[5,1]

  }

  //Using HashTable
  //O(n) runtime, O(n) space
  private static int[] twoSum(int[] arr, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int num = arr[i];
      if (map.containsKey(target - num)) {
        return new int[] {i, map.get(target - num)}; //returns index
        //   return new int[] {num,Math.abs(target-num)}; //to return values
      } else {
        map.put(num, i);
      }
    }
    return new int[2];
  }
}
