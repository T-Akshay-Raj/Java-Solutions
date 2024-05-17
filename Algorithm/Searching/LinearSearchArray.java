package Algorithms.Searching;

import java.util.Arrays;
import java.util.OptionalInt;

public class LinearSearchArray {
  public static void main(String[] args) {
    int[] intArray = new int[] {10, 35, 27, 46, 5, 54, 5};
    LinearSearchArray lsa = new LinearSearchArray();
    System.out.println("Given Array is : " + Arrays.toString(intArray));

    System.out.println("Using regular for loop");
    System.out.println("Element " + 54 + " is found in the array : " +
        lsa.searchElement(intArray, 54));
    System.out.println("Element " + 100 + " is found in the array : " +
        lsa.searchElement(intArray, 100));
    System.out.println();
    System.out.println("Using Enhanced for loop");
    System.out.println("Element " + 54 + " is found in the array : " +
        lsa.searchElement1(intArray, 54));
    System.out.println("Element " + 100 + " is found in the array : " +
        lsa.searchElement1(intArray, 100));

    System.out.println();
    System.out.println("Using While loop");
    System.out.println("Element " + 54 + " is found in the array : " +
        lsa.searchElement2(intArray, 54));
    System.out.println("Element " + 100 + " is found in the array : " +
        lsa.searchElement2(intArray, 100));

    System.out.println();
    System.out.println("Using Streams API and default return -1 if not found");
    System.out.println("Element " + 54 + " is found in the array : " +
        lsa.searchElement3(intArray, 54));
    System.out.println("Element " + 100 + " is found in the array : " +
        lsa.searchElement3(intArray, 100));


    System.out.println();
    System.out.println("Using Streams API and optional return");
    System.out.println("Element " + 54 + " is found in the array : " +
        lsa.searchElement3(intArray, 54));
    System.out.println("Element " + 100 + " is found in the array : " +
        lsa.searchElement3(intArray, 100));
  }

  //Approach 1: Using regular for loop
  //Time Complexity: O(n) and Space Complexity O(1)
  private boolean searchElement(int[] intArray, int k) {
    for (int i = 0; i < intArray.length; i++) {
      if (k == intArray[i]) {
        return true; // if you want to return index "return i"
      }
    }
    return false;
  }

  //Using Enhanced for loop
  //Time Complexity: O(n) and Space Complexity O(1)
  private boolean searchElement1(int[] intArray, int k) {
    for (int i : intArray) {
      if (k == i) {
        return true;
      }
    }
    return false;
  }

  //Using While loop
  //Time Complexity: O(n) and Space Complexity O(1)
  private boolean searchElement2(int[] intArray, int k) {
    int i = 0;
    while (i < intArray.length) {
      if (k == intArray[i]) {
        return true;
      }
      i++;
    }
    return false;
  }

  //Approach 4: Using Streams API
  private boolean searchElement3(int[] intArray, int k) {
    int index =
        Arrays.stream(intArray).filter(x -> x == k).findFirst()
            .orElse(-1);// sets -1 if not found
    boolean res = index == -1 ? false : true;

    return res;
  }

  //Approach 5: Using Streams and returns Optional
  private boolean searchElement4(int[] intArray, int k) {
    OptionalInt index =
        Arrays.stream(intArray).filter(x -> x == k).findFirst();
    boolean res = index.isPresent() ? true : false;

    return res;
  }

}
