package DataStructures.Set;

import java.util.HashSet;
import java.util.Set;

//HashSet is a class that implements Set Interface. It uses a hash table for storage.
//It stores the elements in a hash table, which is basically a HashMap instance.
//HashSet does not allow duplicate elements.
//HashSet allows null values.
//HashSet is not synchronized,HashSet is not thread-safe among multiple threads.
//HashSet is fail-fast, so it throws ConcurrentModificationException if any thread modifies the HashSet while some other thread is iterating over it.
//fail-safe example: https://www.geeksforgeeks.org/fail-fast-fail-safe-java/

public class HashSetExample {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    set.add(21);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(2);


    System.out.println("Elements of Set : "+set);//[2, 3, 4, 21]
  }
}
