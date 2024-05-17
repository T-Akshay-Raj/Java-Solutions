package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
  public static void main(String[] args) {
    //Ways to initialize arraylist
    //1. using Default constructor
    ArrayList<Integer> arrlist1=new ArrayList<>();

    //2. Using any other collection
    Collection<Integer> collection=new ArrayList<>() ;
    ArrayList<Integer> arrlist2=new ArrayList<>(collection);

    //3. Declaring arrlist with initial capacity
    ArrayList<Integer> arrlist3=new ArrayList<>(15); //default capacity is 10

    arrlist1.add(1);
    arrlist1.add(2);
    arrlist1.add(3);


    //Print elements
    arrlist1.forEach(System.out::println);

  }
}
