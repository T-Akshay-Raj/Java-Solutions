package LeetCode.Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
    TwoSum ts = new TwoSum();
    int[] intArray = new int[] {10, 35, 27, 46, 5, 54, 5};
    System.out.println("Approach 1: Using Two for loops to calculate sum for i and i-1, where i starts from 1");
    System.out.println(Arrays.toString(ts.twoSum(intArray,54)));
    System.out.println(Arrays.toString(ts.twoSum(intArray,100)));

    System.out.println("Approach 2: using HashMap to calculate Difference and return result if difference is already saved in previous operations");
    System.out.println(Arrays.toString(ts.twoSum1(intArray, 20)));
    System.out.println(Arrays.toString(ts.twoSum1(intArray,15)));
  }

  //Approach 1: using 2 for loops and returns first pair with sum to target
  public int[] twoSum(int[] nums, int target) {

    for (int i = 1; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        if (nums[j - i] + nums[j] == target) {
          return new int[] {j - i, j};
        }
      }
    }
    return new int[] {};
  }

  //Approach 2: Using HashMap to save difference
  public int[] twoSum1(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap();
    for (int i = 0; i < nums.length; i++) {
      int t = target - nums[i];
      if (map.containsKey(t)) {
        return new int[] {map.get(t), i};
      }
      map.put(nums[i], i);
    }
    return new int[] {};
  }
}
