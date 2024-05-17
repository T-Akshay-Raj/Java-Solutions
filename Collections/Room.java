package Collections;

import java.util.Comparator;
import java.util.Objects;

public class Room implements Comparable<Room> {
  String name;
  String type;
  int capacity;
  double rate;

  public static Comparator<Room> rateComparator=Comparator.comparing(Room::getRate);

  public static Comparator<Room> rateAndTypeComparator=Comparator.comparing(Room::getRate).thenComparing(Comparator.comparing(Room::getType));

  public Room(String name, String type, int capacity, double rate) {
    this.name = name;
    this.type = type;
    this.capacity = capacity;
    this.rate = rate;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public int getCapacity() {
    return capacity;
  }

  public double getRate() {
    return rate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Room room = (Room) o;
    return name.equals(room.name) && type.equals(room.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, capacity);
  }

  @Override
  public String toString() {
    return "Room{" +
        "name='" + name + '\'' +
        ", type='" + type + '\'' +
        ", capacity=" + capacity +
        ", rate=" + rate +
        '}';
  }


  @Override
  public int compareTo(Room o) {
    int result = this.getName().compareTo(o.getName());
    return result != 0 ? result : this.getType().compareTo(o.getType());
  }
}
