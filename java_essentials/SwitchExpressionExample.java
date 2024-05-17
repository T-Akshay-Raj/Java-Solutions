package java_essentials;

import java.util.Scanner;

public class SwitchExpressionExample {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String grade = scan.next();
    String message = switch (grade) {
      case "A":
        yield "Great Work"; //Use yield as return and break which was Introduced in java 13
      case "B":
        yield "Good Work";
      case "C":
        yield "Can do better!";
      case "D":
        yield "Need to put more focus";
      default:
        yield "Invalid Grade";
    };
    scan.close();
    System.out.println("Message: " + message);

    System.out.println(
        "Use case 2: Using switch with return and arrow operator");
    System.out.println(getMessage(grade));
    System.out.println("Use case 3: Multiple case labels");
    System.out.println(getMessage1(grade));

  }

  //Approach 2: Return value through arrow operator ->
  private static String getMessage(String grade) {
    return switch (grade) {
      case "A" -> "Great Work, Keep going!";
      case "B" -> "Good Work";
      case "C" -> "Can do better";
      case "D" -> "Need more focus";
      default -> "Invalid Grade";
    };
  }

  //Switch use case, grouping multiple use case by ","
  private static String getMessage1(String grade) {
    return switch (grade) {
      case "A", "B" -> "Good Work";
      case "C", "D" -> "Needs Improvement";
      default -> throw new IllegalStateException("Unexpected value: " + grade);
    };
  }
}
