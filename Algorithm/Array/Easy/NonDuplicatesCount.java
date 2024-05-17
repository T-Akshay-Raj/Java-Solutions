package Array.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.stream.Collectors;

//Given an array with duplicates entries, return number of non-duplicate elements
public class NonDuplicatesCount {
  public static void main(String[] args) {
    int arr1[] = {1, 1, 2};
    int arr2[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    System.out.println("Given Array Example 1:" + Arrays.toString(arr1));
    System.out.println("Given Array Example 1:" + Arrays.toString(arr2));

    System.out.println("Remove Duplicates Using Set");
    System.out.println(removeDuplicatesUsingSet(arr1));//2
    System.out.println(removeDuplicatesUsingSet(arr2));//5

    System.out.println("Remove Duplicates Using Set");
    System.out.println(removeDuplicatesUsingStream(arr1));//2
    System.out.println(removeDuplicatesUsingStream(arr2));//5

    System.out.println("Using Java 8 Streams");
    System.out.println("Remove Duplicates Using stream and distinct");
    System.out.println(removeDuplicatesUsingStreamAndDistinct(arr1));//2
    System.out.println(removeDuplicatesUsingStreamAndDistinct(arr2));//5


    System.out.println("Using Stream and distinct");
    System.out.println(removeDuplicatesUsingStreamAndDistinct(arr1));
    System.out.println(removeDuplicatesUsingStreamAndDistinct(arr2));


  }

  //Removing Duplicates using Set
  public static int removeDuplicatesUsingSet(int array[]) {
    // Create an empty Set
    Set<Integer> set = new HashSet<>();

    // Iterate through the array
    for (int t : array) {
      // Add each element into the set
      set.add(t);
    }
    // Return the converted Set
    return set.size();
  }

//  private static int removeDuplicatesUsingSet1(int[] arr) {
//    Set<Integer> set = new HashSet<>(Arrays.asList(arr));
//    // Return the converted Set
//    return set.size();
//  }
//


  private static int removeDuplicatesUsingStream(int[] arr) {
    Set<Integer> uniqueSet =
        Arrays.stream(arr).boxed().collect(Collectors.toSet());
    return uniqueSet.size();
  }

  //Removing Duplicates using stream and distinct methods
  private static long removeDuplicatesUsingStreamAndDistinct(int[] arr) {
    return (int) Arrays.stream(arr).distinct().count();
  }
}
