import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
//Predicate are generally used along with filter() intermediate operation of streams
//The abstract method of predicate is boolean test(T t);
public class PredicateExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    //Predicate to filter even numbers
    Predicate<Integer> evenNumber = n -> n % 2 == 0;

    //Testing Predicate
    evenNumber.test(10);//true

    //Applying predicate"evenNumber" to filter only even numbers
    numbers.stream().filter(evenNumber).forEach(System.out::println);//2 4

  }
}
