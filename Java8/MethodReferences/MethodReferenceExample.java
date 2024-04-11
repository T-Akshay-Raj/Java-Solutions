package Java8.MethodReferences;

import java.util.Arrays;

public class MethodReferenceExample {
  public static void main(String[] args) {
    //method reference example
    //Creating a thread using lambda expression
    Thread thread = new Thread(() -> printMessage());
    thread.start();//Hello, this is method reference example

    //Creating a thread using method reference
    Thread thread1 = new Thread(MethodReferenceExample::printMessage);
    thread1.start();  //Hello, this is method reference example

    //Method reference example using stream api
    Arrays.asList(1, 2, 3, 4, 5).stream().forEach(System.out::println);
    
  }

  private static void printMessage() {
    System.out.println("Hello, this is method reference example");
  }
}
