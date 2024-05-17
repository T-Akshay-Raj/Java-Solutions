package java_essentials.CollectionsExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//List Maintains insertion order and allows duplicates and null
public class ListExample {
  public static void main(String[] args) {
    //ArrayList: Maintains Insertion order
    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Carrot");
    fruits.add("Apple");
    fruits.add("");//can add empty string
    fruits.add(null);//can add null
    fruits.add("Dragon Fruit");
    fruits.add(null);//Saves only once
    fruits.add("");//saves only once
    System.out.println(
        fruits);//[Apple, Banana, Carrot, Apple, , null, Dragon Fruit, null, ]
    System.out.println(fruits.size());//9

    //Get Index-First Occurrence in list
    System.out.println(fruits.indexOf("Apple"));//0

    //Get Index- Last Index in List
    System.out.println(fruits.lastIndexOf("Apple"));//3

    System.out.println("Access by index: " + fruits.get(
        2));//Access by index: Carrot  //index starts from 0 like arrays
    //Allows faster resizing when added, replace and remove of element when compared to array
    fruits.set(0, "Avacado");
    System.out.println(
        fruits);//[Avacado, Banana, Carrot, Apple, , null, Dragon Fruit, null, ]
    fruits.remove(8);
    System.out.println(
        fruits);//[Avacado, Banana, Carrot, Apple, , null, Dragon Fruit, null]

    //LinkedList
    List<String> fruits2=new LinkedList<>();
    fruits2.add("Apple");
    fruits2.add("Banana");
    fruits2.add("Carrot");
    fruits2.add("Apple");
    fruits2.add("");//can add empty string
    fruits2.add(null);//can add null
    System.out.println(
        fruits2);//[Apple, Banana, Carrot, Apple, , null]
    System.out.println(fruits2.size());//6



    //Approach 2: Creating list using of() method. Once created it is immutable
    List<String> fruits1 = List.of("Apple", "Banana", "Carrot", "Dragon Fruit");
    System.out.println(fruits1);
    //Using .of() method makes it immutable, we cannot modify after creation, add or remove will throw unSupported Operation error
    // fruits1.add("Avacado");//UnsupportedOperationException
    // fruits4.add("Apple");//UnsupportedOperationException
    //    System.out.println(fruits4);

  }
}
