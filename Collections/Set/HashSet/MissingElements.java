package Collections.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Given Two array, find the elements missing in the second array
public class MissingElements {
  public static void main(String[] args) {
    int[] arr1 = {4, 12, 9, 5, 6};
    int[] arr2 = {4, 9, 12, 6};
    List<Integer> missingElements = findMissingElements(arr1, arr2);
    System.out.println(missingElements);
  }

  private static List<Integer> findMissingElements(int[] arr1, int[] arr2) {
    List<Integer> missingElements = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    for (int i : arr2) {
      set.add(i);
    }
    for (int i : arr1) {
      if (!set.contains(i)) {
        missingElements.add(i);
      }

    }
    return missingElements;
  }
}
