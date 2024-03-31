import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
//Abstract method <T> apply(<T>, <T>).
public class BinaryOperatorExample {
  public static void main(String[] args) {
    BinaryOperator<Integer> b=(x,y)->{ return Integer.compare(x,y);};

    List<Integer> numbers = Arrays.asList(45,32,86,1,68,89,31);
    numbers.stream().sorted((x,y)->b.apply(x,y)).forEach(System.out::println);//1, 31, 32, 45, 68, 86, 89
  }
}
