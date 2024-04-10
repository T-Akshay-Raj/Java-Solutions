package Java8.InterfaceChanges;

interface DefaultInterfaceExample {
  default void print(String message) {
    System.out.println("Hello " + message);
  }

  void printCustomMessage(String message);
}

public class DefaultMethodsExample implements DefaultInterfaceExample {
  public static void main(String[] args) {
    DefaultMethodsExample dme = new DefaultMethodsExample();
    dme.print("Java");//Hello Java
    dme.printCustomMessage("Welcome to java learning");//Hello User, Your Custom Message is Welcome to java learning
  }


  @Override
  public void printCustomMessage(String message) {
    System.out.println("Hello User, Your Custom Message is " + message);
  }
}
