package Java14;

public class SwitchStatementExample {
  enum Day {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}

  public static void main(String[] args) {

    //From java 14, switch can be used to assigned value with variable
    String day = "Monday";
    String whichDay = switch (day) {
      case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Workday";
      case "Saturday", "Sunday" -> "Weekend";
      default -> "Invalid day!";
    };

    //With enums
    Day enumday = Day.Saturday;
    String whichDay2 = switch (enumday) {
      case Monday, Tuesday, Wednesday, Thursday, Friday -> "Workday";
      case Saturday, Sunday -> "Weekend";
      default -> "Invalid Day!!";
    };

  }
}
