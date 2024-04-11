package Java8.StreamsApi.IntermediateOperation;

import Java8.StreamsApi.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
//Filter is an intermediate operation that is used to filter the elements from the stream based on the given predicate.
public class FilterExample {
  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(10, 20, 4, 9, 87, 2, 76);

    //Using Filter Intermediate Operation to get all even numbers to new List
    System.out.println("Using Filter Intermediate Operation to get all even numbers to new List");
    List<Integer> evenNumbers =
        intList.stream().filter(x -> x % 2 == 0).collect(
            Collectors.toList());
    printList(evenNumbers);//10 20 4 2 76

    //Using Filter Intermediate Operation to get all odd numbers and print to console
    System.out.println("Using Filter Intermediate Operation to get all odd numbers and print to console");
    intList.stream().filter(x->x%2!=0).forEach(System.out::println); //9 87

    List<User> users = new ArrayList<User>();

    users.add(new User(30, "cde"));
    users.add(new User(10, "bcd"));
    users.add(new User(45, "cde"));
    users.add(new User(5, "def"));
    users.add(new User(25, ""));

    //Using Filter to get list of all user whose age is less than 18
    System.out.println("Using Filter to get list of all user whose age is less than 18");
    users.stream().filter(user->user.getAge()<=18).forEach(System.out::println);//

    //Using Filter to get list of all user whose name is null
    System.out.println("Using Filter to get list of all user whose name is not null");
    users.stream().map(User::getName).filter(Objects::nonNull).forEach(System.out::println);//cde bcd cde def

  }

  private static void printList(List<Integer> evenNumbers) {
    for (Integer i : evenNumbers) {
      System.out.println(i);
    }
  }

}
