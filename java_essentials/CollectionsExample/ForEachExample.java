package java_essentials.CollectionsExample;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
  public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Carrot");
    fruits.add("Dragon Fruit");

    //forEach approach 1: Using with Lambda
    fruits.forEach(
        f -> System.out.println(f + ","));//Apple, Banana, Carrot,  Dragon Fruit

    fruits.forEach(f -> {
      f = "fruits: " + f;
      System.out.println(f);
    }); //fruits: Apple, fruits: Banana, fruits: Carrot, fruits: Dragon Fruit

    //forEach Approach 2:
    fruits.forEach(System.out::println);//Apple, Banana, Carrot,  Dragon Fruit


  }
}
