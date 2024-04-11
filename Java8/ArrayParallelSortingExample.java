package Java8;

import java.util.Arrays;


public class ArrayParallelSortingExample {
  public static void main(String[] args) {
    //Arrays parallel sorting example
    int[] numbers = {22, 89, 1, 32, 19, 5};
    //parallel sorting of array
    //The Arrays.parallelSort() method is used to sort an array in parallel, is useful when we have a large number of elements in the array
    //The parallel sorting of an array is faster than the normal sorting of an array when we have a large number of elements in the array.
    //The parallel sorting of an array uses the ForkJoinPool to sort the array in parallel,  doesn't guarantee the order of elements.

    Arrays.parallelSort(numbers);
    //print sorted array
    for (int number : numbers) {
      System.out.print(number + " ");//1 5 19 22 32 89
    }


  }
}
