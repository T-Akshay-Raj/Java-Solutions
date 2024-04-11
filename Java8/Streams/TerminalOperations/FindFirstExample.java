package Java8.StreamsApi.TerminalOperations;

import Java8.StreamsApi.model.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindFirstExample {
  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(10, 20, 4, 9, 87, 2, 76);
    System.out.println(
        "Find first element from list whose value is higher than k: " +
            findFirstHigherThanK(intList, 50)); // 87

    List<Person> Persons = new ArrayList<Person>();

    Persons.add(new Person(30L, "cde"));
    Persons.add(new Person(10L, "bcd"));
    Persons.add(new Person(45L, "cde"));
    Persons.add(new Person(5L, "def"));
    Persons.add(new Person(60L, "efg"));
    Persons.add(new Person(25L, ""));

    System.out.println(
        "Find first element from list whose value is higher than k: " +
            findFirstPersonAgeHigherThanK(Persons,
                50));//Person{id=60, name='efg'}

  }

  private static int findFirstHigherThanK(List<Integer> intList, int k) {
    return intList.stream().filter(x -> x > k).findFirst().orElse(0);
  }

  private static Person findFirstPersonAgeHigherThanK(List<Person> persons,
                                                      int i) {
    return persons.stream().filter(person -> person.getId() > i).findFirst()
        .orElse(new Person(0L, ""));
  }

}
