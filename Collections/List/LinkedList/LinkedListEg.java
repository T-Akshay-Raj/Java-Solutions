package Collections.List.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Follows insertion order
//take more memory as each node has data and reference to next node
//slower compared to arraylist for randomly accessing elements
//Are not synchronised
public class LinkedListEg {
  public static void main(String[] args) {
    //declare list
    List<String> randomList = new LinkedList<>();

    //add elements
    randomList.add("abc");
    randomList.add("bcd");
    randomList.add("def");
    //printList
    System.out.println(randomList);
    randomList.add(2, "cde");
    //add element to list at index

    //printList after adding
    System.out.println(randomList);

    //get element by index: O(1)
    System.out.println("Element at index 2: " + randomList.get(2));

    //Check if list contain given string
    System.out.println(
        "List contains Provided String : " + randomList.contains("def"));

    //Get Index of given string from list
    System.out.println("Index of string is :" + randomList.indexOf("abc"));

    randomList.add("abc");
    //Get Index of given string from list
    System.out.println("Index of string is :" + randomList.lastIndexOf("abc"));

    //removeElements from list
    randomList.remove("abc");

//LinkedList are not synchronised but we can create a copy of synchronised list by using Collections
    List<String> newList = Collections.synchronizedList(randomList);
    System.out.println(
        "new List is the sychronised list and can be used with threads" +
            newList);


  }
}
