package Algorithms.Math.List;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

///Find the First Non-repeating Element of a List
public class NonRepeatingFromList {
  public static void main(String[] args) {

    List<Integer> intList = asList(1, 2, 3, 2, 1, 4, 5, 4);

    //Approach 1: Using indexOf() and lastIndexOf()
    System.out.println(" Using indexOf() and lastIndexOf(): " +
        findNonRepeatingUsingIndex(intList));


    //Approach 2: Using hashMap
    System.out.println(" Using findNonRepeatingUsingHashMap: " +
        findNonRepeatingUsingIndex(intList));

  }

  //Using indexOf() and lastIndexOf(): to check if first index of an element is the last index from the list
  //the overall time complexity is O(n^2). This approach uses a constant amount of extra space. Hence, the space complexity is O(1).
//While this approach provides a concise solution, it’s inefficient due to its quadratic time complexity (O(n^2))
  private static int findNonRepeatingUsingIndex(List<Integer> intList) {
    for (int i = 0; i < intList.size(); i++) {
      int temp = intList.get(i);
      if (intList.indexOf(temp) == intList.lastIndexOf(temp)) {
        return intList.get(i);
      }
    }
    return -1;
  }
//Time Complexity O(n) and space complexity in worst case where all elements are unique O(n)
  private static int findNonRepeatingUsingHashMap(List<Integer> intList) {
    Map<Integer, Integer> counts = new HashMap<>();

    for (int num : intList) {
      counts.put(num, counts.getOrDefault(num, 0) + 1);
    }

    for (int num : intList) {
      if (counts.get(num) == 1) {
        return num;
      }
    }

    return -1;
  }
}
