package Algorithms.TwoPointer;

import java.util.ArrayList;
import java.util.List;

/*
Given a sorted array of unique integers and a target integer, return true if there exists a pair of numbers that sum to target, false otherwise. This problem is similar to Two Sum. (In Two Sum, the input is not sorted).
For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13.
 */
//Use TwoPointer approach
public class SumToK {
  public static void main(String[] args) {
    int[] nums ={1, 2, 4, 6, 8, 9, 14, 15};
    int target = 13;
    System.out.println("The Pair of Elements whose is equals to target is : "+findPair(nums,target));
  }

  private static List<Integer> findPair(int[] nums, int target) {
    List<Integer> result = new ArrayList<>();
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      // sum is the current sum
      int sum = nums[left] + nums[right];
      if (sum == target) {
        result.add(nums[left]);
        result.add(nums[right]);
      }

      if (sum > target) {
        right--;
      } else {
        left++;
      }
    }

    return result;
  }

}
