package Java8.StreamsApi.IntermediateOperation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//The peek() method is an intermediate operation that returns a new stream that contains the elements of the original stream along with the additional action to be performed on each element.
// peek() method is useful for debugging the stream elements.
public class PeekExample {
  public static void main(String[] args) {
    //Create a stream of integers
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    //Peek the number of elements to be processed
    List<Integer> intList = stream.peek(System.out::println)
        .collect(Collectors.toList());//1 2 3 4 5 6 7 8 9 10

    //Create a stream of strings
    Stream<String> stream1 =
        Stream.of("Apple", "Banana", "Mango", "Orange", "Grapes");
    //Peek the number of elements to be processed
    List<String> strList = stream1.peek(System.out::println)
        .collect(Collectors.toList());//Apple Banana Mango Orange Grapes

    //peek example with filter
    Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> intList1 = stream2.filter(i -> i % 2 == 0)
        .peek(System.out::println)
        .collect(Collectors.toList());//2 4 6 8 10
  }
}
