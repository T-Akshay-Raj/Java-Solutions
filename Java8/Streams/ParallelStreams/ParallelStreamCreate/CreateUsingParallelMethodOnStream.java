package Java8.StreamsApi.ParallelStreams.ParallelStreamCreate;

import java.util.Arrays;
import java.util.stream.Stream;

/*
    The parallel() method of the Stream interface is used to create a parallel stream.
    The parallel stream is used to process the elements of the stream in parallel.
    The parallel stream uses the ForkJoinPool to process the elements of the stream in parallel.
    The parallel stream doesn't guarantee the order of elements.
 */
public class CreateUsingParallelMethodOnStream {
  public static void main(String[] args) {

    //parallel stream example using .parallel() method
    //Create a stream of integers and print them
    Stream<Integer> integerStream =
        Arrays.asList(1, 2, 3, 4, 5).stream().parallel();
    integerStream.forEach(System.out::println);//3, 4, 5, 1, 2


  }
}
