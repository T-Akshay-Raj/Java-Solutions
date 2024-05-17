package LeetCode.POTD.Day01;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {
  public static void main(String[] args) {
    int[] nums = {3, 4, -1, 1};
    System.out.println(
        "First Missing Positive: " + firstMissingPositive(nums));//2
    int[] nums1 = {1, 2, 0};
    System.out.println(
        "First Missing Positive: " + firstMissingPositive(nums1));//3
    int[] nums2 = {7, 8, 9, 11, 12};
    System.out.println(
        "First Missing Positive: " + firstMissingPositive(nums2));//1

    int[] nums3 = {2147483647};
    System.out.println(
        "First Missing Positive: " + firstMissingPositive(nums3));//1

    int[] nums4 = {1, 1000};
    System.out.println(
        "First Missing Positive: " + firstMissingPositive(nums4));//2

    int[] nums5 = {0};
    System.out.println(
        "First Missing Positive: " + firstMissingPositive(nums5));//1


    int[] num6 = {2, 1};
    System.out.println(
        "First Missing Positive: " + firstMissingPositive(num6));//3
  }

  /*
  The time complexity of this algorithm is O(n), where n is the number of elements in the input array. This is because we iterate through the array twice - once to add elements to a set (which has O(1) average time complexity for insertion) and once to check for the first missing positive integer.
  The space complexity is also O(n) because we are using a HashSet to store the positive integers from the input array. The size of the HashSet can be at most n, where n is the number of elements in the input array.
   */
  private static int firstMissingPositive(int[] nums) {
    int n = nums.length;
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= 0) {
        set.add(nums[i]);
      }
    }
    for (int j = 1; j < n + 1; j++) {
      if (!set.contains(j)) {
        return j;
      }
    }

    return n + 1;
  }


/*
The time complexity of this algorithm is O(n) because it iterates through the input array twice, once to mark the presence of each positive integer and once to find the first missing positive integer.
The space complexity is O(n) as well because it uses a boolean array of size n+1 to keep track of which positive integers are present in the input array.
*/

  private static int firstMissingPositive1(int[] nums) {
    int n = nums.length;
    boolean[] found = new boolean[n + 1];
    for (int i = 0; i < n; i++) {
      if (nums[i] > 0 && nums[i] <= n) {
        found[nums[i]] = true;
      }
    }
    for (int i = 1; i <= n; i++) {
      if (!found[i]) {
        return i;
      }
    }
    return n + 1;
  }

}
