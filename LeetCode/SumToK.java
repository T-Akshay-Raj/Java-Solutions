package LeetCode;

import java.util.HashMap;
import java.util.Map;

/*Given an integer array and an integer K, Find all pairs from array whose sum is equal to k and their count
 *
 * Example:
 * Input:
 * arr={1,5,7,1}, k=6
 * Output: {{1,5},{5,1}}  //arr[0]+arr[1]  & arr[1]+arr[3]
 */
public class SumToK {

  public static void main(String[] args) {
    int[] input = {1, 5, 7, 1};
    int k = 6;
    System.out.println("pairs: " + getPairs(input, k));
  }

  public static int getPairs(int[] arr, int k) {
    int res = 0;
    Map<Integer, Integer> pairs = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      int b = k = arr[i];
      if (pairs.containsKey(b)) {
        res += pairs.get(b);
      }

    }

    return res;
  }

}
