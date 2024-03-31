import java.util.List;
import java.util.function.Consumer;
//Consumer Example
//The abstract method of Consumer is void accept(T t);
//Consumer is generally used along with forEach(), which can be applied to most of the collections
public class ConsumeInterface {
  public static void main(String[] args) {
    //Consumer to print passed element
    Consumer print = c -> System.out.println(c);

   //Applying and Testing Consumer
    print.accept("Hello World");// Hello World

    List<String> fruits = List.of("Apple", "Banana", "Carrot", "Dragon Fruit");
    fruits.forEach(print);//Apple  Banana  Carrot Dragon Fruit

  }
}
