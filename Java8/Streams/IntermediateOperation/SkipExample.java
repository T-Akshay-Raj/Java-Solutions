package Java8.StreamsApi.IntermediateOperation;

import java.util.stream.Stream;

public class SkipExample {
  //skip() method is an intermediate operation that skips the number of elements to be processed from the stream.
  public static void main(String[] args) {
    //Create a stream of integers
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    //Skip the number of elements to be processed
    stream.skip(5).forEach(System.out::println);//6 7 8 9 10

    //Create a stream of strings
    Stream<String>
        stream1 = Stream.of("Apple", "Banana", "Mango", "Orange", "Grapes");
    //Skip the number of elements to be processed
    stream1.skip(3).forEach(System.out::println);//Orange Grapes

  }
}
