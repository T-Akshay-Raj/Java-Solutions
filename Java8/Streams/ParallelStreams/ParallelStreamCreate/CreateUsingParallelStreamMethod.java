package Java8.StreamsApi.ParallelStreams.ParallelStreamCreate;
/*The parallelStream() method of the Collection interface is used to create a parallel stream.
The parallel stream is used to process the elements of the collection in parallel.
The parallel stream uses the ForkJoinPool to process the elements of the collection in parallel.
*/

import Java8.StreamsApi.User;
import java.util.Arrays;
import java.util.stream.Stream;

public class CreateUsingParallelStreamMethod {
  public static void main(String[] args) {
    //creation of parallel stream using parallelStream() method, It doesn't guarantee the order of elements
    //Create a stream of integers and print them
    Stream<Integer> integerStream =
        Arrays.asList(1, 2, 3, 4, 5).parallelStream();
    integerStream.forEach(System.out::println);//3, 4, 5, 1, 2

    //parallel stream example 2
//create a list of User objects and create a parallel stream
    Arrays.asList(new User(25,"Alex"), new User(50,"Brian"), new User(19,"Charles"))
        .parallelStream()
        .forEach(
            user -> System.out.println(user.getName()));//Brian, Alex, Charles

  }
}
