package Java8.StreamsApi.TerminalOperations;

import Java8.StreamsApi.model.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//findAny() method returns an Optional instance which contains any element of the stream which matches the given predicate.
public class FindAnyExample {
  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(10, 20, 4, 9, 87, 2, 76);
    System.out.println(
        "Find Any element from list whose value is higher than k: " +
            findAnyHigherThanK(intList, 50));//87

    List<Person> Persons = new ArrayList<Person>();

    Persons.add(new Person(30L, "cde"));
    Persons.add(new Person(10L, "bcd"));
    Persons.add(new Person(45L, "cde"));
    Persons.add(new Person(5L, "def"));
    Persons.add(new Person(60L, "efg"));
    Persons.add(new Person(25L, ""));

    System.out.println(
        "Find Any Person from list whose age is higher than k: " +
            findAnyHigherThanAgeK(Persons, 50));//Person{id=60, name='efg'}

  }
  private static int findAnyHigherThanK(List<Integer> intList, int i) {
    return intList.stream().filter(x -> x > i).findAny().orElse(0);
  }
  private static Person findAnyHigherThanAgeK(List<Person> persons, int i) {
    return persons.stream().filter(person -> person.getId() > i).findAny()
        .orElse(new Person(0L, ""));
  }


}
