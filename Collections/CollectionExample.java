package Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class CollectionExample {
  public static void main(String[] args) {
    Room r1 = new Room("room1", "deluxe", 2, 2000);
    Room r2 = new Room("room2", "premium", 2, 5000);
    Room r3 = new Room("room2", "suite", 2, 3000);
    Room r4 = new Room("room3", "premium", 2, 5000);
    Room r5 = new Room("room4", "basic", 2, 1500);

//    Collection<Room> rooms = new ArrayList<Room>(List.of(r1,r2));
//    Collection<Room> roomCollections= List.of(r1,r2);

    Collection<Room> roomCollections1 = Arrays.asList(r1, r2, r3, r4, r5);

    //print room Collections
    System.out.println(roomCollections1);

    //Another way to print room collections
//    System.out.println(roomCollections1.forEach(System.out::println));


    //Another way to print room collections using enhanced forloop
    System.out.println(printRoom(roomCollections1));

    //Calculate day charges with streams
    calculateDayCharges(roomCollections1);

    Room[] rooms = new Room[5];
    rooms[0] = r1;
    rooms[1] = r2;

    //Sort
    System.out.println("Sorting by name and type");
    roomCollections1.stream().sorted().forEach(System.out::println);/*
    Room{name='room1', type='deluxe', capacity=2, rate=2000.0}
Room{name='room2', type='premium', capacity=2, rate=5000.0}
Room{name='room2', type='suite', capacity=2, rate=3000.0}
Room{name='room3', type='premium', capacity=2, rate=5000.0}
Room{name='room4', type='basic', capacity=2, rate=1500.0}
*/
    System.out.println("Sort by rate");
    roomCollections1.stream().sorted(Room.rateComparator)
        .forEach(System.out::println);
/*
Room{name='room4', type='basic', capacity=2, rate=1500.0}
Room{name='room1', type='deluxe', capacity=2, rate=2000.0}
Room{name='room2', type='suite', capacity=2, rate=3000.0}
Room{name='room2', type='premium', capacity=2, rate=5000.0}
Room{name='room3', type='premium', capacity=2, rate=5000.0}
 */
    System.out.println("Sort by rate and Type");
    roomCollections1.stream().sorted(Room.rateAndTypeComparator)
        .forEach(System.out::println);
/*
Room{name='room4', type='basic', capacity=2, rate=1500.0}
Room{name='room1', type='deluxe', capacity=2, rate=2000.0}
Room{name='room2', type='suite', capacity=2, rate=3000.0}
Room{name='room2', type='premium', capacity=2, rate=5000.0}
Room{name='room3', type='premium', capacity=2, rate=5000.0}
 */

   Room minIndex=
       roomCollections1.stream().min(Room.rateComparator)
           .orElse(new Room("", "", 0, 0));

    System.out.printf("Minimum rate: %d", minIndex);
//    System.out.printf("Maximum rate: %d", maxIndex.isPresent()?maxIndex:-1);


  }

  private static boolean printRoom(Collection<Room> rooms) {
    for (Room r : rooms) {
      System.out.println(r);
    }

    return true;
  }

  private static double calculateDayCharges(Collection<Room> rooms) {
    return rooms.stream().mapToDouble(r -> r.getRate()).sum();
  }
}
