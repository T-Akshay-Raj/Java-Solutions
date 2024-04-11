package Java8.StreamsApi.TerminalOperations;

import java.util.Arrays;
import java.util.List;
//count() method is a terminal operation that returns the count of elements in the stream.
public class CountExample {
  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(10, 20, 4, 9, 87, 2, 76);
    System.out.println("Count of elements in the list: " + countElements(intList));

  }

  private static int countElements(List<Integer> intList) {
    return (int) intList.stream().count();
  }
}
