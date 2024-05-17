package DataStructures.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class List1<I extends Number> {
  public static void main(String[] args) {
    // Ways to Add data to List1

//    List1<Integer> list1= List.of(10, 20,4, 9, 87,2, 76);

    //1. Using Arrays.asList()
    List<Integer> intList = Arrays.asList(10, 20, 4, 9, 87, 2, 76);
    System.out.println("Print List created using Arrays.asList()");
    printList(intList);

    //2. Creating a List of Integers using IntStream
    System.out.println("Print Creating a List of Integers using IntStream");
    List integers = IntStream
        .range(1, 10)
        .boxed()
        .collect(Collectors.toCollection(ArrayList::new));
    printList(integers);
  }

  private static void printList(List<Integer> evenNumbers) {
    for (Integer i : evenNumbers) {
      System.out.println(i);
    }
  }
}
