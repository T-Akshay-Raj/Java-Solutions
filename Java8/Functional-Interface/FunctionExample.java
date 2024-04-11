import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
//Function Interface is genarally used along with map
//Abstract method of function is R apply(T t);
public class FunctionExample {
  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    //Function to square the number
    Function<Integer, Integer> square = i -> i * i;
    System.out.println(square.apply(5));//25

    //The Abstract method of function is R apply(T t); Generally used with stream.map()
    numbers.stream().map(square).forEach(System.out::println);//1 4 9 16 25

  }
}
