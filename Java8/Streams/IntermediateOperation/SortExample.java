package Java8.StreamsApi.IntermediateOperation;

import Java8.StreamsApi.model.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//sorted() method is used to sort the elements of a stream. It takes a Comparator as an argument.
public class SortExample {
  public static void main(String[] args) {

    //List of unsorted Integers
    List<Integer> intList = Arrays.asList(10, 20, 4, 9, 87, 2, 76);
    // Sort the list
    intList.stream().sorted().forEach(System.out::println);//2 4 9 10 20 76 87

    //List of unsorted Strings
    List<String> strList = Arrays.asList("A", "Z", "B", "C", "D", "E");
    // Sort the list
    strList.stream().sorted().forEach(System.out::println);//A B C D E Z


    List<Person> personList = new ArrayList<>();
    personList.add(new Person(1L, "A"));
    personList.add(new Person(2L, "E"));
    personList.add(new Person(3L, "D"));
    personList.add(new Person(4L, "C"));
    personList.add(new Person(2L, "B"));
    personList.add(new Person(5L, ""));

    System.out.println("Person List : " +
        personList);//[Person{id=1, name='A'}, Person{id=2, name='E'}, Person{id=3, name='D'}, Person{id=4, name='C'}, Person{id=2, name='B'}, Person{id=5, name=''}]
    System.out.println(
        "Person List sorted by Id : " + getPersonListSortedById(
            personList));//Person{id=1, name='A'}, Person{id=2, name='E'}, Person{id=2, name='B'}, Person{id=3, name='D'}, Person{id=4, name='C'}, Person{id=5, name=''}]
    System.out.println(
        "Person List sorted by Id : " + getPersonListSortedByIdAndName(
            personList));//[Person{id=1, name='A'}, Person{id=2, name='B'}, Person{id=2, name='E'}, Person{id=3, name='D'}, Person{id=4, name='C'}, Person{id=5, name=''}]
  }

  //sort by id
  private static List<Person> getPersonListSortedById(List<Person> personList) {
    return personList.stream()
        .sorted((p1, p2) -> p1.getId().compareTo(p2.getId()))
        .collect(Collectors.toList());
  }

  //Sort by id approach 2
  private static List<Person> getPersonListSortedById1(
      List<Person> personList) {
    return personList.stream().sorted(Comparator.comparing(Person::getId))
        .collect(Collectors.toList());
  }

  //sort by id and by name if id is same
  private static List<Person> getPersonListSortedByIdAndName
  (List<Person> personList) {
    return personList.stream().sorted((p1, p2) -> {
      int idCompare = p1.getId().compareTo(p2.getId());
      if (idCompare == 0) {
        return p1.getName().compareTo(p2.getName());
      }
      return idCompare;
    }).collect(Collectors.toList());
  }

  //approach 2: sort by id and by name if id is same
  private static List<Person> getPersonListSortedByIdAndName1(
      List<Person> personList) {
    return personList.stream()
        .sorted(
            Comparator.comparing(Person::getId).thenComparing(Person::getName))
        .collect(Collectors.toList());
  }

}
