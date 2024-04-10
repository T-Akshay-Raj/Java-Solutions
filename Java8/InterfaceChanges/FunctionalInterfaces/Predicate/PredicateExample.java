package Java8.FunctionalInterfaces.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    //Predicate to filter even numbers
    Predicate<Integer> evenNumber = n -> n % 2 == 0;

    //Predicate to filter odd numbers
    Predicate<Integer> oddNumber = n -> n % 2 != 0;

    //Filter even numbers
    numbers.stream().filter(evenNumber).forEach(System.out::println);//2 4

    //Filter odd numbers
    numbers.stream().filter(oddNumber).forEach(System.out::println);//1 3 5

  }
}
