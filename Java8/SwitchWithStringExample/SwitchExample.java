package Java8.SwitchWithStringExample;

public class SwitchExample {
  public static void main(String[] args) {
    //String in switch expression
    String day = "Monday";
    switch (day) {
      case "Monday":
      case "Tuesday":
      case "Wednesday":
      case "Thursday":
      case "Friday":
        System.out.println("Weekday");//Weekday
        break;
      case "Saturday":
      case "Sunday":
        System.out.println("Weekend");
        break;
      default:
        System.out.println("Invalid Option");
    }
  }
}
