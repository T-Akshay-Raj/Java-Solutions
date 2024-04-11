package Java8.StreamsApi.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(10, 20, 4, 9, 87, 2, 76);
    System.out.println("Printing elements of the list: ");
   intList.stream().forEach(System.out::println);//10 20 4 9 87 2 76

  }
}
