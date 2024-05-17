package Algorithms.TwoPointer;

import java.util.Arrays;

public class MoveZeroesToBeginning {
  public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    moveZeroesToBeginning(nums);
    System.out.println("After moving zeroes to the end of the array");
    System.out.println("nums = " + Arrays.toString(nums));//nums = [0, 0, 1, 3, 12]

    int[] nums1 = {0};
    moveZeroesToBeginning(nums1);
    System.out.println("After moving zeroes to the end of the array");
    System.out.println("nums = " + Arrays.toString(nums1));//nums = [0]

    int[] nums2 = {3, 5, 0, 0, 4};
    moveZeroesToBeginning(nums2);
    System.out.println("After moving zeroes to the end of the array");
    System.out.println("nums = " + Arrays.toString(nums2));//[0, 0, 3, 5, 4]

    int[] nums3 = {0, 0, 0, 4};
    moveZeroesToBeginning(nums3);
    System.out.println("After moving zeroes to the end of the array");
    System.out.println("nums = " + Arrays.toString(nums3));//[0, 0, 0, 4]
  }
  //Move Zeroes to the beginning of the array using two pointer approach
  private static void moveZeroesToBeginning(int[] nums) {
    int i = 0, j = 0;
    while (j < nums.length) {
      if (nums[j] == 0) {
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
}
