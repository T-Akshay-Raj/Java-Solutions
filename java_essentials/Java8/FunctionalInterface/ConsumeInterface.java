package java_essentials.Java8.FunctionalInterface;

import java.util.List;
import java.util.function.Consumer;

import static java.util.List.*;

public class ConsumeInterface {
  public static void main(String[] args) {
    Consumer print = c -> System.out.println(c);

    //The abstract method of Consumer is void accept(T t);
    print.accept("Hello World");// Hello World

//    List<String> fruits = of("Apple", "Banana", "Carrot", "Dragon Fruit");
//    fruits.forEach(print);//Apple  Banana  Carrot Dragon Fruit

  }
}
