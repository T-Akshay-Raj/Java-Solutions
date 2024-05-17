package java_essentials.CollectionsExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Store non duplicates
public class SetExample {
  public static void main(String[] args) {
    Set<String> fruits = new HashSet<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Carrot");
    fruits.add("Apple");
    fruits.add("");//can add empty string
    fruits.add(null);//can add null

    fruits.add("Dragon Fruit");
    fruits.add(null);//Saves only once
    fruits.add("");//saves only once
    System.out.println(fruits);//[, null, Apple, Carrot, Dragon Fruit, Banana]
    System.out.println(fruits.size());//6


    //Using Linked HashSet- Store non duplicate and maintains insertion order
    Set<String> fruits1 = new LinkedHashSet<>();
    fruits1.add("Apple");
    fruits1.add("Banana");
    fruits1.add("Carrot");
    fruits1.add("Apple");
    fruits1.add("");//can add empty string
    fruits1.add(null);//can add null

    fruits1.add("Dragon Fruit");
    fruits1.add(null);//Saves only once
    fruits1.add("");//saves only once
    System.out.println(fruits1); //[Apple, Banana, Carrot, , null, Dragon Fruit]
    System.out.println(fruits1.size());//6

    //TreeSet :  Saves data in sorted order as tree stores data in sorted order and Doesn't allow null
    Set<String> fruits2 = new TreeSet<>();
    fruits2.add("Apple");
    fruits2.add("Banana");
    fruits2.add("Carrot");
    fruits2.add("Apple");
    fruits2.add("");//can add empty string
//    fruits2.add(null);//Gives Null Pointer exception

    fruits2.add("Dragon Fruit");
//    fruits2.add(null);//Saves only once
    fruits2.add("");//saves only once
    System.out.println(fruits2); //[, Apple, Banana, Carrot, Dragon Fruit]
    System.out.println(fruits2.size());//5

    //Another way to create a set using .of() method, but it creates immutable Set
    Set<String> fruits4 = Set.of("", "Apple", "Banana", "Carrot",
        "Dragon Fruit");//adding null here to the list would give null pointer exception
    System.out.println(fruits4);//[Dragon Fruit, , Carrot, Apple, Banana]
    //Using .of() method makes it immutable, we cannot modify after creation, add or remove will throw unSupported Operation error
    //    fruits4.add("Avacado");//UnsupportedOperationException
    // fruits4.add("Apple");//UnsupportedOperationException
    //    System.out.println(fruits4);

  }
}
