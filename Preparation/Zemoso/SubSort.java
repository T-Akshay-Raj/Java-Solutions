package Preparation.Zemoso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSort {
  public static void main(String[] args) {
    List<Integer> intList1 = Arrays.asList(2, 6, 4, 8, 10, 9, 15);
    List<Integer> intList2 = Arrays.asList(1, 2, 3, 4);
    List<Integer> intList3 = Arrays.asList(1);
    List<Integer> intList4 =
        Arrays.asList(10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60);
    List<Integer> intList5 = Arrays.asList(0, 1, 15, 25, 6, 7, 30, 40, 50);

    System.out.println(subarraySort(new ArrayList<>(intList1)));//5
    System.out.println(subarraySort(new ArrayList<>(intList2)));//0
    System.out.println(subarraySort(new ArrayList<>(intList3)));//0
    System.out.println(subarraySort(new ArrayList<>(intList4)));//6
    System.out.println(subarraySort(new ArrayList<>(intList5)));//4
  }


  /*
1. From left to right, find the potential start s where nums[s+1]<nums[s]
2. From right to left, find the potential end e where nums[e]<nums[e-1]
3. Find the min value and max value of the elements between start and end, compare them with the numbers from 0 to s and e to length -1. Update the start and end.
Return end - start + 1
  */
  public static int subarraySort(ArrayList<Integer> arr) {
    // Write your code here.
    int n = arr.size();
    int start = 0;
    int end = n - 1;
    //Step 1:  From left to right, find the potential start s where nums[s+1]<nums[s]
    while (start < n - 1 && arr.get(start) <= arr.get(start + 1)) {
      start++;
    }
    if (start == n - 1) {
      return 0;
    }
    //Step 2: From right to left, find the potential end e where nums[e]<nums[e-1]
    while (end > 0 && arr.get(end) >= arr.get(end - 1)) {
      end--;
    }
    //Step 3: Find the min value and max value of the elements between start and end
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = start; i <= end; i++) {
      min = Math.min(min, arr.get(i));
      max = Math.max(max, arr.get(i));
    }

    //Step 3(b): compare them with the numbers from 0 to s and e to length -1. Update the start and end.
    while (start > 0 && arr.get(start - 1) > min) {
      start--;
    }
    while (end < n - 1 && arr.get(end + 1) < max) {
      end++;
    }
    return end - start + 1;
  }
}
