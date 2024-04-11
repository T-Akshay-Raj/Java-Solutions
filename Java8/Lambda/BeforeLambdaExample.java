package Java8.Lambdas;

public class BeforeLambdaExample {
  public static void main(String[] args) {
    InterfaceExample1 interfaceExample1 = new InterfaceExample1() {
      public void print(String message) {
        System.out.println(message);
      }
    };
    interfaceExample1.print("Hello World");//Hello World
  }
}