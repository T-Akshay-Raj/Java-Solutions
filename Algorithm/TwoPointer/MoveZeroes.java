package Algorithms.TwoPointer;

import java.util.Arrays;

public class MoveZeroes {
  public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    moveZeroes(nums);
    System.out.println("After moving zeroes to the end of the array");
    System.out.println("nums = " + Arrays.toString(nums));//nums = [1, 3, 12, 0, 0]

    int[] nums1 = {0};
    moveZeroes(nums1);
    System.out.println("After moving zeroes to the end of the array");
    System.out.println("nums = " + Arrays.toString(nums1));//nums = [0]

    int[] nums2 = {3, 5, 0, 0, 4};
    moveZeroes(nums1);
    System.out.println("After moving zeroes to the end of the array");
    System.out.println("nums = " + Arrays.toString(nums2));//[3, 5, 0, 0, 4]

    int[] nums3 = {0, 0, 0, 4};
    moveZeroes(nums1);
    System.out.println("After moving zeroes to the end of the array");
    System.out.println("nums = " + Arrays.toString(nums3));//[0, 0, 0, 4]
  }

  //Move Zeroes to the end of the array using two pointer approach
  private static void moveZeroes(int[] nums) {
    int i = 0, j = 0;
    while (j < nums.length) {
      if (nums[j] != 0) {
        nums = swap(nums, i, j);
        i++;
      }
      j++;
    }
  }

  private static int[] swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    return nums;
  }

  //Approach 2: add all non-zero elements to array first and then fill remaining index with zeros
  public void moveZeroes1(int[] nums) {
    int i = 0;
    for (int num : nums)
      if (num != 0)
        nums[i++] = num; //add all non zero to array first

    while (i < nums.length)
      nums[i++] = 0; // fill remaining index with zeros
  }

}
