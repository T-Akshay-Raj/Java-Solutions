package Java8.Lambdas;

public class AfterLambdaExample {
  public static void main(String[] args) {
    InterfaceExample interfaceExample = (message) -> System.out.println(message);
    interfaceExample.print("Hello World");//Hello World
  }
}
