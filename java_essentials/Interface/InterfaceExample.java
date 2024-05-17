package java_essentials.Interface;

interface communicate {
  void showMessage(String message);
}

public class InterfaceExample implements communicate {
  public static void main(String[] args) {
    InterfaceExample example = new InterfaceExample();
    example.showMessage("Hello World");//Hello World
  }

  public void showMessage(String message) {
    System.out.println(message);
  }
}

