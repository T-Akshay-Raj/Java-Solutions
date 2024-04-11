package Java8.StreamsApi.TerminalOperations;

import Java8.StreamsApi.model.Person;
import java.util.stream.Stream;

//The reduce() method of the Stream interface is used to reduce the elements of a stream to a single value.
//The reduce() method takes a BinaryOperator as a parameter. The BinaryOperator is a functional interface that takes two values and returns a single value.
//The reduce() method takes two arguments:  an identity value and a BinaryOperator.
public class ReduceExample {
  public static void main(String[] args) {
    //Create a stream of integers and calculate the sum of all elements
    int sum = Stream.of(1, 2, 3, 4, 5).reduce(0, (a, b) -> a + b);
    System.out.println(sum);//15

    //or
    //Create a stream of integers and calculate the sum of all elements
    int sum1 = Stream.of(1, 2, 3, 4, 5).reduce((a, b) -> a + b).get();
    System.out.println(sum1);//15

    //Create a stream of integers and calculate the product of all elements
    int product = Stream.of(1, 2, 3, 4, 5).reduce(1, (a, b) -> a * b);
    System.out.println(product);//120

    //Create a stream of integers and calculate the max element
    int max = Stream.of(1, 2, 3, 4, 5).reduce(0, (a, b) -> a > b ? a : b);
    System.out.println(max);//5

    //Create a stream of integers and calculate the min element
    int min = Stream.of(1, 2, 3, 4, 5).reduce(0, (a, b) -> a < b ? a : b);
    System.out.println(min);//0

    //Create a stream of integers and calculate the max of all elements
    int max1 = Stream.of(1, 2, 3, 4, 5).reduce(Integer::max).get();
    System.out.println(max1);//5

    //Create a stream of integers and calculate the min of all elements
    int min1 = Stream.of(1, 2, 3, 4, 5).reduce(Integer::min).get();
    System.out.println(min1);//1

    //more examples of reduce() method using custom objects
    //Create a stream of custom objects and calculate the sum of all elements
    long sum2 = Stream.of(new Person(1L, "Alex"), new Person(2L, "Brian"), new Person(3L, "Charles"))
        .mapToLong(Person::getId).reduce(0, (a, b) -> a + b);
    System.out.println(sum2);//6

  }
}
