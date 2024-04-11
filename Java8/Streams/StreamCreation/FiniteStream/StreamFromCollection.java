package Java8.StreamsApi.StreamCreation.FiniteStream;

import Java8.StreamsApi.model.Person;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Most Collections offer a stream() method that returns a sequential stream of the elements in the collection.
public class StreamFromCollection {
  public static void main(String[] args) {
    //Using stream() method of the Collection interface, we can create a stream from a collection.
    //List of Strings
    List<String> fruits = Arrays.asList("Apple", "Banana", "Mango");
    //Create a stream from the list
    Stream<String> fruitsStream = fruits.stream();
    //Print the elements of the stream
    fruitsStream.forEach(System.out::println); //Apple Banana Mango

    //List of Integers
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    //Create a stream from the list
    Stream<Integer> numbersStream = numbers.stream();
    //Print the elements of the stream
    numbersStream.forEach(System.out::println);//1 2 3 4 5

    //List of doubles
    List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
    //Create a stream from the list
    Stream<Double> doubleStream = doubleList.stream();
    //Print the elements of the stream
    doubleStream.forEach(System.out::println);//1.1 2.2 3.3 4.4 5.5

    //List of characters
    List<Character> charList = Arrays.asList('a', 'b', 'c', 'd', 'e');
    //Create a stream from the list
    Stream<Character> charStream = charList.stream();
    //Print the elements of the stream
    charStream.forEach(System.out::println);//a b c d e

    //List of Custom Objects
    List<Person> personList = Arrays.asList(new Person(1L, "Alex"), new Person(2L, "Brian"), new Person(3L, "Charles"));
    //Create a stream from the list
    Stream<Person> personStream = personList.stream();
    //Print the elements of the stream
    personStream.forEach(System.out::println);//Person{id=1, name='Alex'} Person{id=2, name='Brian'} Person{id=3, name='Charles'}

  }
}
