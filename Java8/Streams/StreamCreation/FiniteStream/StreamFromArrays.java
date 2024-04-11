package Java8.StreamsApi.StreamCreation.FiniteStream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFromArrays {
  public static void main(String[] args) {

    //Using Arrays.stream() method, we can create a stream from an array of objects or from an array of primitive data types.
    //Array of strings
    String[] fruits = {"Apple", "Banana", "Mango"};
    //Create a Stream from the array of strings
    Stream<String> fruitsStream = Arrays.stream(fruits);
    //print the elements of the stream
    fruitsStream.forEach(System.out::println);//Apple Banana Mango

    //Array of integers
    int[] arr = {1, 2, 3, 4, 5};
    //Create a IntStream from the array of integers
    IntStream integerStream = Arrays.stream(arr);
    //Print the elements of the stream
    integerStream.forEach(System.out::println);//1 2 3 4 5

    //Approach 2:
    //Using Stream.of() method, we can create a stream from an array of objects or from an array of primitive data types.
    //Stream created using stream.of() method is a sequential stream and doesn't allow modification of elements.
    //Array of Strings
    Stream<String> fruitsStream1 = Stream.of("Apple", "Banana", "Mango");
    //Print the elements of the stream
    fruitsStream1.forEach(System.out::println);//Apple Banana Mango

    //Array of Integers
    Stream<Integer> numbersStream1 = Stream.of(1, 2, 3, 4, 5);
    //Print the elements of the stream
    numbersStream1.forEach(System.out::println);//1 2 3 4 5

    //Array of doubles
    Stream<Double> doubleStream = Stream.of(1.1, 2.2, 3.3, 4.4, 5.5);
    //Print the elements of the stream
    doubleStream.forEach(System.out::println);//1.1 2.2 3.3 4.4 5.5
  }
}
