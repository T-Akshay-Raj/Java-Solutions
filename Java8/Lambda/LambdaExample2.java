package Java8.Lambdas;

public class LambdaExample2 {
  //Lambda example 2 with multiple parameters
  public static void main(String[] args) {
    InterfaceExample2 interfaceExample2 =
        (message, number) -> System.out.println(message + number);
    interfaceExample2.print("Hello World ", 10);//Hello World 10
  }

  interface InterfaceExample2 {
    void print(String message, int number);
  }
}
