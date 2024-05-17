package java_essentials.Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
//Abstract method of predicate is  boolean test(T t);
public class PredicateExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    //Predicate to filter even numbers
    Predicate<Integer> evenNumber = n -> n % 2 == 0;

    //The abstract method of predicate is boolean test(T t);
    evenNumber.test(10);//true

    //Consumer to print
    Consumer print = c -> System.out.println(c);

    numbers.stream().filter(evenNumber).forEach(print);//2 4

  }
}
