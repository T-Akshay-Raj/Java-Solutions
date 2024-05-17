package Algorithms.TwoPointer;

import java.util.Arrays;

public class DutchFlagProblem {
  public static void main(String[] args) {
    //dutch flag problem or sort colors problem
    int[] nums = {2, 0, 2, 1, 1, 0};
    int[] nums1 = {2, 0, 1};
//    sortColors(nums);
//    System.out.println("After sorting the colors");
//    System.out.println("nums = " + Arrays.toString(nums));//nums = [0, 0, 1, 1, 2, 2]
//
//    sortColors(nums1);
//    System.out.println("After sorting the colors");
//    System.out.println("nums = " + Arrays.toString(nums1));//nums = [0,1,2]

    System.out.println("Using two pointer approach");
    sortColors1(nums);
    System.out.println("After sorting the colors");
    System.out.println("nums = " + Arrays.toString(nums));//nums = [0, 0, 1, 1, 2, 2]

    sortColors1(nums1);
    System.out.println("After sorting the colors");
    System.out.println("nums = " + Arrays.toString(nums1));//nums = [0,1,2]
  }

  //Sort colors using three pointer approach
  private static void sortColors(int[] nums) {
    int i = 0, j = 0, k = nums.length - 1;
    while (j <= k) {
      if (nums[j] == 0) {
        nums = swap(nums, i, j);
        i++;
        j++;
      } else if (nums[j] == 1) {
        j++;
      } else {
        nums = swap(nums, j, k);
        k--;
      }
    }
  }

  //sort colors using two pointer approach
  private static void sortColors1(int[] nums) {
    int i = 0, j = 0;
    while (j < nums.length) {
      if (nums[j] == 0) {
        nums = swap(nums, i, j);
        i++;
      }
      j++;
    }
    j = i;
    while (j < nums.length) {
      if (nums[j] == 1) {
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
