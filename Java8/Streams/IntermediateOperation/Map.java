package Java8.StreamsApi.IntermediateOperation;

import Java8.StreamsApi.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//map() method is an intermediate operation that is used to transform the elements of the stream.
//The map() method takes a Function as an argument, which is applied to each element of the stream.

public class Map {
  public static void main(String[] args) {
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    //Using map to get even and odd numbers
    System.out.println("Using stream print even and odd numbers using map() Intermediate Operation");
    stream.map(x -> {
      if (x % 2 == 0) {
        return "Even: " + x;
      } else {
        return "Odd: " + x;
      }
    }).forEach(System.out::println);//Even: 1 Odd: 2 Even: 3 Odd: 4 Even: 5 Odd: 6 Even: 7 Odd: 8 Even: 9 Odd: 10


    //Using map to incrememnt all elements by 1
    System.out.println("Using stream to increment all elements by 1 using map() Intermediate Operation");
    Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    stream1.map(x -> x + 1).forEach(System.out::println);//2 3 4 5 6 7 8 9 10 11

    //Using map to get length of all strings
    System.out.println("Using stream to get length of all strings using map() Intermediate Operation");
    Stream<String> stream2 = Stream.of("abc", "def", "ghi", "jkl", "mno");
    stream2.map(String::length).forEach(System.out::println);//3 3 3 3 3

    //Using map to append string having vowels and re print the list
    System.out.println("Using stream to append string having vowels using map() Intermediate Operation");
    Stream<String> stream3 = Stream.of("abc", "def", "ghi", "jkl", "mno");
    stream3.map(s -> s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u") ? s + " contains vowels" : s + " does not contain vowels")
        .forEach(System.out::println);//abc contains vowels def contains vowels ghi contains vowels jkl does not contain vowels mno contains vowels

    List<User> users = new ArrayList<User>();

    users.add(new User(30, "cde"));
    users.add(new User(10, "bcd"));
    users.add(new User(45, "cde"));
    users.add(new User(5, "def"));
    users.add(new User(25, ""));

    //Using Map to get age of all users using map  Intermediate operation and collect Terminal Operation
    List<Integer> usersAge = new ArrayList<>();
    System.out.println(
        "Prints user age using  Intermediate Operation: map and Terminal Operation: collect()");
    usersAge = getAllUserAge(users);
    System.out.println("Age of all Users: " + usersAge);//30 10 45 5 25

    //Improvised version of above code using map Intermediate operation, method reference and ForEach to print
    System.out.println(
        "Prints user age using map Intermediate operation, method reference and ForEach to print");
    printUsersAge(users);//30 10 45 5 25

    //Using Intermediate Operation map and filter to get all users with name not null
    System.out.println(
        "Using Intermediate Operation map and filter to get all users with name not null");
    printName(users);//cde bcd cde def

    //Using Intermediate Operation map and sum to get sum of all user's age
    System.out.println(
        "Using Intermediate Operation map and sum to get sum of all user's age");
    System.out.println(sumOfAllUsers(users));//115
  }

  private static void printName(List<User> users) {
    users.stream().map(User::getName).filter(Objects::nonNull)
        .forEach(System.out::println);
  }

  private static void printUsersAge(List<User> users) {
    users.stream().map(User::getAge).forEach(System.out::println);
  }

  private static List<Integer> getAllUserAge(List<User> users) {
    return users.stream().map(user -> user.getAge())
        .collect(Collectors.toList());
  }

  private static int sumOfAllUsers(List<User> users) {
    return users.stream().mapToInt(user -> user.getAge()).sum();
  }

}
