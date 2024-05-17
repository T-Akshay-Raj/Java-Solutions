package LeetCode;

public class BinarySearchElement {
  public static void main(String[] args) {
    int[] intArray = new int[] {10, 35, 27, 46, 5, 54, 5};
    BinarySearchElement bse = new BinarySearchElement();
    System.out.println("Element "+46+" is found in the given array at index "+bse.search(intArray,46));
    System.out.println("Element "+80+" is found in the given array at index "+bse.search(intArray,80));
  }

  //Approach 1: Iterative Approach
  public int search(int[] nums, int target) {
    int arrlength = nums.length;
    int minIndex = 0, maxIndex = arrlength - 1;
    while (minIndex <= maxIndex) {
      int midIndex = (1 + minIndex + maxIndex) / 2;
      if (target == nums[midIndex]) {
        return midIndex;
      } else if (target > nums[midIndex]) {
        minIndex = midIndex + 1;
      } else {
        maxIndex = midIndex - 1;
      }
    }
    System.gc();
    return -1; //returns -1 if not found

  }
}
