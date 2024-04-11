package Java8.StreamsApi.IntermediateOperation;

import java.util.stream.Stream;
//The limit() method is an intermediate operation that limits the number of elements to be processed from the stream.
public class LimitExample {
  public static void main(String[] args) {
    //Create a stream of integers
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    //Limit the number of elements to be processed
    stream.limit(5).forEach(System.out::println);//1 2 3 4 5

    //Create a stream of strings
    Stream<String> stream1 = Stream.of("Apple", "Banana", "Mango", "Orange", "Grapes");
    //Limit the number of elements to be processed
    stream1.limit(3).forEach(System.out::println);//Apple Banana Mango
  }
}
