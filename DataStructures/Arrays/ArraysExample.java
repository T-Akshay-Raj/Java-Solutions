package DataStructures.Arrays;

import java.util.Arrays;

//Print Largest number in the array
public class ArraysExample {
  public static void main(String[] args) {
    int[] intArray={9,29,390,47,583,2,94};

    //Find Largest using streams()
    System.out.println("largest Number in the integer Array: "+getLargestElement(intArray));

    //Find Smallest using streams()
    System.out.println("Smallest Number in the integer Array: "+getSmallestElement(intArray));
  }

  private static int getSmallestElement(int[] intArray) {
    return Arrays.stream(intArray).min().getAsInt();
  }

  private static int getLargestElement(int[] intArray) {
    return Arrays.stream(intArray).max().getAsInt();
  }
}
