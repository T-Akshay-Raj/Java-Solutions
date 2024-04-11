import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
//Abstact method of supplier is T get();
public class SupplierExample {
  public static void main(String[] args) {

    //Supplier Example 1: to return a four-digit number
    Supplier<Integer> otp = () -> {
      Random random = new Random();
      return random.nextInt(1000, 9999);//generate 4 digit random number
    };

    // Testing the opt supplier
    System.out.println(otp.get());

    //Supplier Example 2: To return a random list of integers below 100 of size 10
    Supplier<List<Integer>> randomIntegersList = () -> {
      List<Integer> list = new ArrayList<>();
      Random random = new Random();
      for (int i = 0; i < 10; i++) {
        list.add(random.nextInt(100));
      }
      return list;
    };

     // Testing the random integer list supplier
    List<Integer> numbers = randomIntegers.get();
    System.out.println("Random Integers: " + numbers);
  }
}
