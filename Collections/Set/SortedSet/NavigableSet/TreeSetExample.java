package Collections.Set.SortedSet.NavigableSet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

//Stores Unique elements in sorted order
public class TreeSetExample {
  public static void main(String[] args) {
    Set<String> fruits = new TreeSet<>();
    fruits.add("apple");
    fruits.add("banana");

    fruits.add("dragon fruit");
    fruits.add("carrot");
    fruits.add("apple");

    System.out.println("Elements of treeSet: " + fruits);

    //Choose custom sorting order as below
    //Sorting order is now set to sort by length
    Set<String> fruits1 = new TreeSet<>(Comparator.comparing(String::length));
    fruits1.add("apple");
    fruits1.add("banana");
    fruits1.add("dragon fruit");
    fruits1.add("carrot");
    //Here set consider unique ness by length of string, since apple of length 6 is already added to set, it considers carrot as duplicate and doesn't add it to tree set
    fruits1.add("apple");

    System.out.println("Elements of treeSet1: " +
        fruits1); //output : [apple, banana, dragon fruit]

    List<String> fruits2 =
        Arrays.asList("apple", "banana", "carrot", "dragon fruit");
    NavigableSet nSet = new TreeSet(fruits2);
    //descending order
    nSet.descendingSet().stream().forEach(
        System.out::println); //dragon fruit,carrot,banana,apple

    List<Integer> integerList=Arrays.asList(10, 35, 27, 46, 5, 54, 5,50);
    NavigableSet<Integer> intSet=new TreeSet<>(integerList);

    //HeadSet to get elements less than given value
    intSet.headSet(50).stream().forEach(System.out::println);//5 10 27 35 46
    //HeadSet to get elements less than  or equal to given value
    intSet.headSet(50,true).stream().forEach(System.out::println);//5 10 27 35 46 50

    //tailSet to get elements higher than given value
    intSet.tailSet(15).stream().forEach(System.out::println);//27 35 46 50 54

    System.out.println("Tail Set inclusive");
    //tailSet to get elements greater than  or equal to given value
    intSet.tailSet(10).stream().forEach(System.out::println);// 10 27 35 46 50 54

    System.out.println("Subset Example");
    //Subset to pick between 2 numbers
    intSet.subSet(15,40).stream().forEach(System.out::println); // 27 35

    //Just higher than given value
    System.out.println("Higher");
    System.out.println(intSet.higher(20).shortValue());//27

    //Just lower than given value
    System.out.println("lower");
    System.out.println(intSet.lower(45).intValue());//35

  }
}
