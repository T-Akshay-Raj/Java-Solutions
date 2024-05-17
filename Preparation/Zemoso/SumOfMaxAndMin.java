package Preparation.Zemoso;

import java.util.Arrays;

/*
Problem statement
You are given an array “ARR” of size N. Your task is to find out the sum of maximum and minimum elements in the array.

Follow Up:
Can you do the above task in a minimum number of comparisons?
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10
1 <= N <= 10^5
-10^9 <= ARR[i] <= 10^9

Time limit: 1 second
Sample Input 1:
2
7
1 2 4 5 6 6 6
6
-1 -4 5 8 9 3
Sample Output 1:
7
5
Explanation For Sample Input 1:
For the first test case, the maximum element in the array is 6 and the minimum element in the array is 1.

For the second test case, the maximum element in the array is 9 and the minimum element in the array is -4.
Sample Input 2:
2
5
3 3 3 3 3
1
-1
Sample Output 2:
6
-2
 */
public class SumOfMaxAndMin {
  public static void main(String[] args) {
    int[] input = {1, 2, 4, 5, 6, 6, 6};
    int[] input2 = {-1, -4, 5, 8, 9, 3};
    int[] input3 = {3, 3, 3, 3, 3};
    int[] input4 = {-1};
    SumOfMaxAndMin smm = new SumOfMaxAndMin();
    System.out.println(smm.sumOfMaxAndMin(input)); //7
    System.out.println(smm.sumOfMaxAndMin(input2)); //5
    System.out.println(smm.sumOfMaxAndMin(input3)); //6
    System.out.println(smm.sumOfMaxAndMin(input)); //-2
  }

  //Using regular for loop
  private int sumOfMaxAndMin(int[] input) {  //O(n)
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < input.length; i++) {
      if (input[i] > max) {
        max = input[i];
      }
      if (input[i] < min) {
        min = input[i];
      }
    }
    return max + min;
  }

  //approach 2: Using Stream  //O(n)
  private int sumOfMaxAndMin1(int[] input) {  //O(n)
    int max = Arrays.stream(input).max().getAsInt();
    int min = Arrays.stream(input).min().getAsInt();
    return max + min;
  }


  //approach 3: Using Arrays.sort  //O(nlogn)
  private int sumOfMaxAndMin2(int[] input) {  //O(nlogn)
    Arrays.sort(input);
    return input[0] + input[input.length - 1];
  }

  //approach 4: Using Arrays.parallelSort  //O(nlogn)
  private int sumOfMaxAndMin3(int[] input) {  //O(nlogn)
    Arrays.parallelSort(input);
    return input[0] + input[input.length - 1];
  }

  //Approach 5: Using Arrays.parallelSetAll  //O(n)
  private int sumOfMaxAndMin4(int[] input) {  //O(n)
    int[] max = {Integer.MIN_VALUE};
    int[] min = {Integer.MAX_VALUE};
    Arrays.parallelSetAll(input, i -> {
      if (input[i] > max[0]) {
        max[0] = input[i];
      }
      if (input[i] < min[0]) {
        min[0] = input[i];
      }
      return input[i];
    });
    return max[0] + min[0];
  }

  //approach 6: Using Arrays.parallelPrefix  //O(n)
  private int sumOfMaxAndMin5(int[] input) {  //O(n)
    int[] max = {Integer.MIN_VALUE};
    int[] min = {Integer.MAX_VALUE};
    Arrays.parallelPrefix(input, (left, right) -> {
      if (left > max[0]) {
        max[0] = left;
      }
      if (left < min[0]) {
        min[0] = left;
      }
      return right;
    });
    return max[0] + min[0];
  }


  //approach 7: Using Arrays.stream  //O(n)
  private int sumOfMaxAndMin6(int[] input) {  //O(n)
    int max = Arrays.stream(input).reduce(Integer.MIN_VALUE, Integer::max);
    int min = Arrays.stream(input).reduce(Integer.MAX_VALUE, Integer::min);
    return max + min;
  }

}
