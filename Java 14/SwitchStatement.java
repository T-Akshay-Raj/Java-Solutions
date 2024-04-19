package Java14;

public class SwitchStatement {
  public static void main(String[] args) {

    System.out.println(isFeedingTime(10));//false
    System.out.println(isFeedingTime(21));//true

    System.out.println(isFeedingTime1(10));//false
    System.out.println(isFeedingTime1(21));//true
  }

  //switch statement example as per java 14 allows grouping case separated by "," and use "->" to overcome break statement
  public static boolean isFeedingTime(int hour) {
    boolean isFeedingTime;
    switch (hour) {
      case 2, 16, 21 -> isFeedingTime = true;
      default -> isFeedingTime = false;
    }
    return isFeedingTime;
  }

  //switch statement example as per java 14 allows grouping case separated by "," and use "->" to overcome break statement and yield for multi statements
  public static boolean isFeedingTime1(int hour) {
    boolean isFeedingTime =
        switch (hour) {
          case 2, 16, 21 -> true;
          default -> {
            System.out.println("There is still time for feeding!!");
            yield false;
          }
        };
    return isFeedingTime;

  }
}
