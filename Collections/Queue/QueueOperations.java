package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    //EnQueueing: adding Elements to the queue
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);


    //Check if queue is empty
    System.out.println("Queue is Empty: " + queue.isEmpty());

    //Fetch Element from the queue -Peek() method doesn't delete element return element or null if there are no elements to fetch
    System.out.println("Fetch First Element from the queue: " + queue.peek());

    //Fetch Element from the queue -element() method doesn't delete element, return element or  throws NoSuchElement Exception if there are no elements to fetch
    System.out.println("Fetch First Element from the queue: " + queue.element());


    //Delete Element using remove(), return element or throws exception if no elements exist
    System.out.println("Remove First Element from the queue: " + queue.remove());


    //Delete Element using poll(), return element or null if no elements exist
    System.out.println("Remove First Element from the queue: " + queue.poll());


    Queue<Integer> queue1 = new LinkedList<>();

    // System.out.println("Fetch First Element from the queue: "+queue1.peek());//null
    // System.out.println("Fetch First Element from the queue: "+queue1.element()); //NoSuchElementException

    // System.out.println("Remove First Element from the queue: "+queue1.remove()); //NoSuchElementException
    //System.out.println("Remove First Element from the queue: "+queue1.poll()); //null

  }
}
