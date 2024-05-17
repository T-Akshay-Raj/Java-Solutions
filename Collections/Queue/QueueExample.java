package Collections.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
  public static void main(String[] args) {
    Queue<String> fruits = new ArrayDeque<>();
    fruits.offer("apple");
    fruits.offer("banana");
    fruits.offer("carrot");
    fruits.offer("Dragon fruit");

    //print queue
    System.out.println("Queue elements are: " + fruits);

    //get first element
    System.out.println("First Element of the queue: " +
        fruits.peek());//peek() returns element but doesn't delete it from queue

    //remove element
    System.out.println("Removing first element of the queue: " +
        fruits.remove()); //remove() deletes and returns the element from the queue

    System.out.println("Queue elements after removal are: " + fruits);

    //remove particular element
    System.out.println(
        "Removing particular element 'carrot'"+ fruits.remove("carrot"));
    System.out.println("Queue elements after removal are: " + fruits);
  }
}
