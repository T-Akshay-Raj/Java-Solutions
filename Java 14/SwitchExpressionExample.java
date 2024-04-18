package Java14;

public class SwitchExpressionExample {
  public static void main(String[] args) {

    //Switch expression enabled to return result, blocks {} can be used after -> to incorporate multiple lines and use yield to return value.
    //yield is only for switch expressions
    System.out.println(isFeedingTime(10));//Meow!  Is it feeding time yet?  false
    System.out.println(isFeedingTime(21));//true
  }

  public static boolean isFeedingTime(int hour) {

    return switch (hour) {
      case 2, 16, 21 -> true;
      default -> {
        System.out.println("Meow!  Is it feeding time yet?");
        yield false;
      }
    };
  }
}
