package basic.array;

import java.util.Arrays;

public class ArrayExample {
  public static void main(String[] args) {

    // 3 Ways to create and initialize an array
    int[] arr1 = {1, 2, 3, 4, 5};

    int[] arr2 = new int[] {1, 2, 3, 4, 5};

    int[] arr3 = new int[6];
    arr3[0] = 1;
    arr3[1] = 2;
    arr3[2] = 3;
    arr3[4] = 4;
    arr3[5] = 5;


    //Ways to load data to declared array
    int[] arr4 = new int[10];

    //1. using Arrays.fill()
    Arrays.fill(arr4, 1);
    //[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

    //2. Using Arrays.copy()
    int[] arr5 = Arrays.copyOf(arr2, 10);

    //3. Using System.arraycopy()
    int[] arr6 = new int[10];
    System.arraycopy(arr2, 0, arr6, 0, arr2.length);

    //4. Using Arrays.copyOfRange()
    int[] arr7 = Arrays.copyOfRange(arr2, 0, 5);

    //5. Using Arrays.setAll() and UnaryOperator to increase the value by 1
    int[] arr8 = new int[10];
    Arrays.setAll(arr8, i -> i + 1);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  }

  //Ways to Print elements of Array
  //1. Using For Loop
  private static void printArrayUsingForLoop(int[] input) {
    System.out.println("Using For Loop");
    for (int i = 0; i < input.length; i++) {
      System.out.println(input[i]);
    }
  }

  //2. Using Enhanced For Loop
  private static void printArrayUsingEnhancedForLoop(int[] input) {
    System.out.println("Using Enhanced For Loop");
    for (int i : input) {
      System.out.println(i);
    }
  }

  //3. Using Arrays.toString()
  private static void printArrayUsingArraysToString(int[] input) {
    System.out.println("Using Arrays.toString");
    System.out.println(Arrays.toString(input));
  }

  //4. Using Arrays and stream of Java8
  private static void printUsingStreamOfJava8(int[] input) {
    System.out.println("Using Arrays and Stream ");
    Arrays.stream(input).forEach(System.out::println);
  }

  //5. Using Arrays.deepToString() to print multi-dimensional array
  private static void printUsingArraysDeepToString() {
    int[][] arr = {{1, 2, 3}, {4, 5, 6}};
    System.out.println(Arrays.deepToString(arr));
  }

}
