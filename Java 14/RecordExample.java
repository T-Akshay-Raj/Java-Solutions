package Java14;
// Record is a new feature in Java 14 and is a preview feature in java 14
// It is a class that is a data carrier for immutable data and is a final class, so it cannot be extended
//cuts down on boilerplate code by providing getters, equals, hashcode, and toString
//constructor is private
//fields are final


record Employee(int id, String name) {
  //may create additional methods in this space

}

public class RecordExample {
  public static void main(String[] args) {
    Employee Employee = new Employee(1, "abc");
    System.out.println(Employee);//Employee[id=1, name=abc]
    System.out.println(Employee.id() + " " + Employee.name());//1 abc
  }
}
