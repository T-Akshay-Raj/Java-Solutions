package Algorithms.Searching;

import java.util.Arrays;

public class BinarySearchArray {
  public static void main(String[] args) {
    int[] intArray = new int[] {10, 35, 27, 46, 5, 54, 5};
    BinarySearchArray bsa = new BinarySearchArray();
    System.out.println("Given Array is : " + Arrays.toString(intArray));
    System.out.println();

    System.out.println("Approach 1: Using Iterative Approach");
    System.out.println("Element found at : " + bsa.binarySearch(intArray, 54));
    System.out.println("Element found at : " + bsa.binarySearch(intArray, 80));
    System.out.println();

    System.out.println("Approach 2: Using Recursive Approach");
    System.out.println("Element found at : " +
        bsa.binarySearch2(intArray, 54, 0, intArray.length - 1));
    System.out.println("Element found at : " +
        bsa.binarySearch2(intArray, 80, 0, intArray.length - 1));
    System.out.println();

    System.out.println(
        "Approach 3: Using Built in binarySearch Function, return negative index if not found");
    System.out.println("Element found at : " +
        Arrays.binarySearch(intArray, 54));//return index
    System.out.println("Element found at : " +
        Arrays.binarySearch(intArray,
            80));//return index else return negative Index

  }

  //Approach 1: Iterative Approach, Returns Index if found, else return -1
  private int binarySearch(int[] intArray, int item) {
    int minIndex = 0, maxIndex = intArray.length - 1;
    while (minIndex <= maxIndex) {
      int midIndex = (1 + minIndex + maxIndex) / 2;
      if (item == intArray[midIndex]) {
        return midIndex;
      } else if (item > intArray[midIndex]) {
        minIndex = midIndex + 1;
      } else {
        maxIndex = midIndex - 1;
      }
    }
    return -1;
  }

  //Approach 2: Recursive Approach, return Index is found else return -1
  private int binarySearch2(int[] intArray, int item, int minIndex,
                            int maxIndex) {
    if (minIndex <= maxIndex) {
      int mid = (1 + minIndex + maxIndex) / 2;
      if (item == intArray[mid]) {
        return mid;
      }
      if (item > intArray[mid]) {
        return binarySearch2(intArray, item, mid + 1, maxIndex);
      } else {
        return binarySearch2(intArray, item, minIndex, mid - 1);
      }
    }

    return -1;
  }
}
