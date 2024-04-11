package Java8.StreamsApi.TerminalOperations;

import Java8.StreamsApi.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//max() and min() methods are terminal operations that return the maximum and minimum element in the stream respectively.
public class MinMax {
  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(10, 20, 4, 9, 87, 2, 76);
    System.out.println(
        "Minimum element in the list: " + findMinElement(integerList));//2
    System.out.println(
        "Maximum element in the list: " + findMaxElement(integerList));//87

    //Min and Max on User object
    List<User> users = new ArrayList<User>();

    users.add(new User(30, "cde"));
    users.add(new User(10, "bcd"));
    users.add(new User(45, "cde"));
    users.add(new User(5, "def"));
    users.add(new User(25, ""));
    System.out.println(
        "User with Minimum age in the list: " + findMinAgeUser(users));//User{age=5, name='def'}
    System.out.println(
        "User with Maximum age in the list: " + findMaxAgeUser(users));//User{age=45, name='cde'}

  }

  private static int findMinElement(List<Integer> integerList) {
    return integerList.stream().min(Comparator.naturalOrder()).orElse(0);
  }

  private static int findMaxElement(List<Integer> integerList) {
    return integerList.stream().max((o1, o2)->o1.compareTo(o2)).orElse(0);
  }

  private static User findMinAgeUser(List<User> userList) {
    return userList.stream().min(Comparator.comparing(User::getAge))
        .orElse(new User(0, ""));
  }

  private static User findMaxAgeUser(List<User> integerList) {
    return integerList.stream().max(Comparator.comparing(User::getAge))
        .orElse(new User(0, ""));
  }

}
