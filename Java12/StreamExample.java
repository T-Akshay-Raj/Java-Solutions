package Java12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {
  public static void main(String[] args) {
    //Collectors.teeing
    //Collectors.teeing() is a new collector added in Java 12. It is used to combine the result of two collectors into a single result.
    //The first argument is the first collector, the second argument is the second collector, and the third argument is a function that combines the results of the two collectors.
    //The function should not be null.

    //Collectors.teeing() is used to calculate the average of the list of integers.
    //The first collector calculates the sum of the list of integers.
    //The second collector calculates the count of the list of integers.
    //The third argument is a function that calculates the average of the sum and count.
    //The function takes two arguments, the sum and the count, and returns the average.
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    Double average = list.stream().collect(
        Collectors.teeing(Collectors.summingDouble(i -> i),
            Collectors.counting(), (sum, count) -> sum / count));
    System.out.println("Average = " + average);
  }
}
