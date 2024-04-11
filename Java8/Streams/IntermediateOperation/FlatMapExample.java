package Java8.StreamsApi.IntermediateOperation;

import Java8.StreamsApi.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//The flatMap() method is an intermediate operation that transforms the elements of the stream into a different stream.
public class FlatMapExample {
  public static void main(String[] args) {
    List<String> list1 = Arrays.asList("One", "Two", "Three", "Four", "Five");
    List<String> list2 = Arrays.asList("Six", "Seven", "Eight", "Nine", "Ten");

    //apply flatMap() method
    List<String> finalList = Arrays.asList(list1, list2).stream()
        .flatMap(list -> list.stream())
        .collect(Collectors.toList());
    System.out.println(
        finalList);//One Two Three Four Five Six Seven Eight Nine Ten

    //flatMap example with multidimensional array
    String[][] data = new String[][] {{"a", "b"}, {"c", "d"}, {"e", "f"}};
    List<String> flatList = Arrays.stream(data)
        .flatMap(x -> Arrays.stream(x))
        .collect(Collectors.toList());
    System.out.println(flatList);//a b c d e f


    //flatmap example to merge two lists of users
    List<User> users = new ArrayList<>();
    users.add(new User(30, "John"));
    users.add(new User(40, "Martin"));
    users.add(new User(50, "Mary"));

    List<User> users1 = new ArrayList<>();
    users1.add(new User(60, "John"));
    users1.add(new User(70, "Martin"));
    users1.add(new User(80, "Mary"));

    List<List<User>> userList = new ArrayList<>();
    userList.add(users);
    userList.add(users1);

    List<User> finalUserList = userList.stream()
        .flatMap(user -> user.stream())
        .collect(Collectors.toList());
    System.out.println(finalUserList);//[User{age=30, name='John'}, User{age=40, name='Martin'}, User{age=50, name='Mary'}, User{age=60, name='John'}, User{age=70, name='Martin'}, User{age=80, name='Mary'}]
  }
}
