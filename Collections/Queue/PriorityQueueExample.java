package Collections.Queue;

import Collections.Room;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
  public static void main(String[] args) {
    Queue<String> fruits = new PriorityQueue<>();

    fruits.offer("apple");
    fruits.offer("banana");
    fruits.offer("carrot");
    fruits.offer("Dragon fruit");
    System.out.println("print elements of priority queue" +
        fruits);//[Dragon fruit, apple, carrot, banana]

    Queue<Integer> intQueue = new PriorityQueue<>();
    intQueue.offer(10);
    intQueue.offer(40);
    intQueue.offer(78);
    intQueue.offer(5);
    intQueue.offer(32);

    System.out.println(
        "print elements of priority queue" + intQueue);//[5, 10, 78, 40, 32]

    //Custom Object
    Room r1 = new Room("room1", "deluxe", 2, 2000);
    Room r2 = new Room("room2", "premium", 2, 5000);
    Room r3 = new Room("room3", "basic", 2, 1000);

    Collection<Room> roomCollections1 = Arrays.asList(r1, r2);

    Comparator<Room> roomComparator =
        Comparator.comparing(Room::getRate).reversed();
    Queue<Room> roomQueue = new PriorityQueue<>(roomComparator);
    roomQueue.add(r1);
    roomQueue.add(r2);
    roomQueue.add(r3);
    System.out.println("Priority Queue of Room: " + roomQueue);
    //[Room{name='room2', type='premium', capacity=2, rate=5000.0}, Room{name='room1', type='deluxe', capacity=2, rate=2000.0}, Room{name='room3', type='basic', capacity=2, rate=1000.0}]

  }
}
