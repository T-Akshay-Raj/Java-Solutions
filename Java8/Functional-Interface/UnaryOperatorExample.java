import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
//Abstract method of unaryOperator is apply()
public class UnaryOperatorExample {
  public static void main(String[] args) {
    UnaryOperator<Integer> square = num->num * num;
    System.out.println("Square of a number: 2 is ");
    System.out.println(square.apply(2));


    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    numbers.replaceAll(square);
    System.out.println(numbers);
  }
}
