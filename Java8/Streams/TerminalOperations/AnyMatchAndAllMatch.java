package Java8.StreamsApi.TerminalOperations;

import java.util.Arrays;
import java.util.List;
//anyMatch() method returns true if any element of the stream matches the given predicate, otherwise false.
//allMatch() method returns true if all elements of the stream match the given predicate, otherwise false.
public class AnyMatchAndAllMatch {
  public static void main(String[] args) {
    List<Integer> integerList= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    boolean isAnyMatch= integerList.stream().anyMatch(i->i%2==0);
    System.out.println("Is any element in the list is even: "+isAnyMatch);//true
    boolean isAllMatch= integerList.stream().allMatch(i->i%2==0);
    System.out.println("Are all elements in the list are even: "+isAllMatch); //false

  }
}
