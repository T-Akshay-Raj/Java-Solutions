package Java8.MethodReferences;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*Reference to constructor - Class::new:
Using :: to invoke the constructor.process(new ArrayList()) can be simplified as process(ArrayList::new);
 */
public class ReferenceToConstructor {
  public static void main(String[] args) {
    //2. Creating a List of Integers using IntStream
    System.out.println("Print Creating a List of Integers using IntStream");
    List integers = IntStream
        .range(1, 10)
        .boxed()
        .collect(Collectors.toCollection(ArrayList::new));
    printList(integers);
  }

  private static void printList(List<Integer> evenNumbers) {
    for (Integer i : evenNumbers) {
      System.out.println(i);
    }
  }
}
