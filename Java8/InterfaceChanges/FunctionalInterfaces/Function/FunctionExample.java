package Java8.FunctionalInterfaces.Function;

import Java8.StreamsApi.User;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//Function is a functional interface that takes one argument and returns a result.
public class FunctionExample {
  public static void main(String[] args) {

    //Function to square the number
    Function<Integer, Integer> f = i -> i * i;
    System.out.println(f.apply(5));//25

    //Function to find the length of the string
    Function<String, Integer> f1 = s -> s.length();
    System.out.println(f1.apply("Java8"));//5

    List<User> users = new ArrayList<User>();
    users.add(new User(30, "cde"));

    //Function to get age
    Function<User, Integer> f2 = user -> user.getAge();
    System.out.println(f2.apply(users.get(0)));//30

    //Function to get name
    Function<User, String> f3 = user -> user.getName();
    System.out.println(f3.apply(users.get(0)));//cde

    //function to get age of user only if age is higher than 18
    Function<User, Integer> f4 = user -> user.getAge() > 18 ? user.getAge() : 0;

    //Function to convert string to uppercase
    Function<String, String> f5 = s -> s.toUpperCase();
    System.out.println(f5.apply("java8"));//JAVA8
  }
}
