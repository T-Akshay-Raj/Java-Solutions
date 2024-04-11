//interface before lambda 
package Java8.Lambdas;

/**
 * LambdaExample
 */
@FunctionalInterface
interface InterfaceExample {
  void print(String message);
}

//before lambda example
public class LambdaExample implements InterfaceExample {
  public void print(String message) {
    System.out.println(message);
  }

  public static void main(String[] args) {
    LambdaExample lambdaExample = new LambdaExample();
    lambdaExample.print("Hello World");//Hello World
  }
}

