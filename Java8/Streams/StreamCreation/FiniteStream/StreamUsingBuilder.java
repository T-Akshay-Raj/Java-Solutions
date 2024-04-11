package Java8.StreamsApi.StreamCreation.FiniteStream;

import Java8.StreamsApi.model.Person;
import java.util.stream.Stream;

//Using Stream.builder() method, we can create a stream of objects.
//The Stream.builder() method returns a Stream.Builder object that can be used to add elements to the stream.
//The add() method of the Stream.Builder interface is used to add elements to the stream.
//The build() method of the Stream.Builder interface is used to create a stream from the elements added to the stream builder.

public class StreamUsingBuilder {
  public static void main(String[] args) {

    //Create a stream of strings
    Stream<String> stream = Stream.<String>builder().add("Apple").add("Banana").add("Mango").build();
    stream.forEach(System.out::println);//Apple Banana Mango
    //OR
    Stream.builder().add("Apple").add("Banana").add("Mango").build().forEach(System.out::println);//Apple Banana Mango

    //Create a Stream of Integers
    Stream<Integer> stream1 = Stream.<Integer>builder().add(1).add(2).add(3).build();
    stream1.forEach(System.out::println);//1 2 3

    //Create a Stream of custom objects
    Stream<Person> stream2 = Stream.<Person>builder().add(new Person(1L, "Alex")).add(new Person(2L, "Brian")).build();
    stream2.forEach(System.out::println);//Person{id=1, name='Alex'} Person{id=2, name='Brian'}

  }
}
