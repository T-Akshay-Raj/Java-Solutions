package Java8.InterfaceChanges;

interface StaticExample {
  static void print(String message) {
    System.out.println("Hello " + message);
  }

  void printCustomMessage(String message);
}

public class StaticMethodExample implements StaticExample {
  public static void main(String[] args) {
//Access Static method of any interface - InterfaceName.staticMethodName()
    StaticExample.print("Java");//Hello Java

    StaticMethodExample sme=new StaticMethodExample();
    sme.printCustomMessage("Welcome to java learning");//Hello User, Your Custom Message is Welcome to java learning
  }

  @Override
  public void printCustomMessage(String message) {
    System.out.println("Hello User, Your Custom Message is " + message);
  }
}
