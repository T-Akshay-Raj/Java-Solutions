package Java8.StreamsApi.StreamCreation.InfiniteStream;

import java.util.stream.Stream;

public class StreamIterate {
  public static void main(String[] args) {
    //The iterate() method of the Stream interface returns an infinite sequential ordered stream produced by iterative application of a function f to an initial element seed, producing a Stream consisting of seed, f(seed), f(f(seed)), etc.
    // Note: There is no fixed size for the stream. We can limit the number of elements by using the limit() method. If we don't use the limit() method, it will generate an infinite stream.
    //Create a stream of even numbers
    //Care should be taken while using the iterate() method because it can generate an infinite stream.
    System.out.println("Create a stream of even numbers, limited to 5");
    Stream.iterate(0, n -> n + 2).limit(5).forEach(System.out::println);//0 2 4 6 8

    //Create a stream of odd numbers
    System.out.println("Create a stream of odd numbers, limited to 5");
    Stream.iterate(1, n -> n + 2).limit(5).forEach(System.out::println);//1 3 5 7 9

    //Create a stream of powers of 2
    System.out.println("Create a stream of powers of 2, limited to 5");
    Stream.iterate(1, n -> n * 2).limit(5).forEach(System.out::println);//1 2 4 8 16

    //Create a stream of Fibonacci series
    System.out.println("Create a stream of Fibonacci series, limited to 5");
    Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}).limit(5).forEach(n -> System.out.println(n[0]));//0 1 1 2 3

    //Create a stream of factorial series
    System.out.println("Create a stream of factorial series, limited to 5");
    Stream.iterate(new int[]{1, 1}, n -> new int[]{n[0] + 1, n[1] * (n[0] + 1)}).limit(5).forEach(n -> System.out.println(n[1]));//1 2 6 24 120
  }
}
