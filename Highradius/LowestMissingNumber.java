package Highradius;

import java.util.Arrays;
import java.util.stream.IntStream;

//Given an array of integers , find the lowest missing number
public class LowestMissingNumber {
  public static void main(String[] args) {
    int a[] = {2, 4, 1, 6, 9, 8, 10};
    //For above example, missing numbers are 3,5,7. Lowest missing number among them is 3
    System.out.println("Lowest Missing Number is "+findLowestMissingNumber(a));//3


  }

  //Approach 1: method to find the lowest missing number using sort
  //The time complexity of this algorithm is O(n log n) due to the sorting of the input array. The space complexity is O(1) as the algorithm only uses a constant amount of extra space regardless of the input size.
  public static int findLowestMissingNumber(int[] nums) {
    Arrays.sort(nums);
    int previous=nums[0];
    if(0!=previous) return 0;
    for(int i=1;i<nums.length;i++){
      if(previous+1!=nums[i])
        return previous+1;
      previous=nums[i];
    }
    return nums[nums.length-1]+1;
  }


}
