package Java8.Optional;

import Java8.StreamsApi.User;
import java.util.Optional;

public class OptionalExample {
  public static void main(String[] args) {
    //Optional Example
    //Create an empty Optional object
    Optional<String> empty = Optional.empty();
    System.out.println(empty);//Optional.empty

    //using is present and is empty
    if (empty.isPresent()) {
      System.out.println(empty.get());
    } else {
      System.out.println("empty is empty");//empty is empty
    }

    //Create a non-empty Optional object
    Optional<String> nonEmpty = Optional.of("Hello");
    System.out.println(nonEmpty);//Optional[Hello]


/*
    //Create a non-empty Optional object with null value
    Optional<String> nonEmptyWithNull = Optional.of(null);//NullPointerException
    System.out.println(nonEmptyWithNull);//Null Pointer exception
*/
//optional example with user object
//Create an empty Optional object
    Optional<User> emptyUser = Optional.empty();
    System.out.println(emptyUser);//Optional.empty

    //Create a non-empty Optional object
    Optional<User> nonEmptyUser = Optional.of(new User(25, "Alex"));
    System.out.println(nonEmptyUser);//Optional[User{id=25, name='Alex'}]

    //Create a non-empty Optional object with null value
    Optional<User> nonEmptyUserWithNull =
        Optional.of(new User(25, null));
    System.out.println(
        nonEmptyUserWithNull);//Optional[User{age=25, name='null'}]
    System.out.println(nonEmptyUserWithNull.get());//User{age=25, name='null'}
    System.out.println(nonEmptyUserWithNull.get().getName());//null
  }
}

