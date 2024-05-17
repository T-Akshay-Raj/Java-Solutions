package java_essentials.sealed_classes;

public sealed class Shape permits Rectangle, Circle{
  public void printMessage()
  {
    System.out.println("This is Shape Class");
  }
}
