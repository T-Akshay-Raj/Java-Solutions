package Java8.StreamsApi.StreamCreation.FiniteStream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Using IntStream, DoubleStream, and LongStream interfaces, we can create a stream of primitive data types. The Stream.of() method does not support primitive data types.
public class StreamFromPrimitive {
  public static void main(String[] args) {

    //Create a stream of integers
    IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
    intStream.forEach(System.out::println);//1 2 3 4 5

    //create a stream of doubles
    DoubleStream doubleStream = DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5);
    doubleStream.forEach(System.out::println);//1.1 2.2 3.3 4.4 5.5

    //Create a stream of integers using range
    IntStream intStream1 = IntStream.range(1, 5);
    intStream1.forEach(System.out::println);//1 2 3 4

    //Create a stream of integers using rangeClosed
    IntStream intStream2 = IntStream.rangeClosed(1, 5);
    intStream2.forEach(System.out::println);//1 2 3 4 5

  }
}
