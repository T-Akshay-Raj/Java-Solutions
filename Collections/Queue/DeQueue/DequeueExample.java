package Collections.Queue.DeQueue;

import java.util.ArrayDeque;
import java.util.Deque;

//Deque or double ended queue is A linear collection that supports element insertion and removal at both ends
//ArrayDeque is not synchronised, so it runs much faster than stack
public class DequeueExample {
  public static void main(String[] args) {
    Deque<String> fruits = new ArrayDeque<>();
    fruits.push("apple");
    fruits.push("banana");
    fruits.push("carrot");
    fruits.push("Dragon fruit");

    //Print Dequeue
    System.out.println("Elements of Dequeue is : " + fruits);

    //pop Element
    System.out.println("First element pop is : " + fruits.pop());

    //Check is Stack is Empty using
    System.out.println("Is Stack Empty: " + fruits.isEmpty());

    //Get Stack size using size() which is provided by collection interface
    System.out.println("Size of Stack is : " + fruits.size());

    //Add elements at first
    fruits.addFirst("Avacado");
    System.out.println(" After Add elements at first: " + fruits);

    //Add elements at last
    fruits.addLast("EggFruit");
    System.out.println(" After Add elements at last: " + fruits);

    //Remove element using remove- most recent
    fruits.remove();
    System.out.println("After remove: " + fruits);

    //remove element using pop least recent
    fruits.pop();
    System.out.println("After pop: " + fruits);

    //works same as pop but doesn't throw exception if empty
    System.out.println(fruits.poll());
    System.out.println("After poll " +fruits);
    //Similarly, can remove elements from both side and also peek elements from both sides using
//    fruits.removeFirst(); fruits.removeLast();

  }
}
