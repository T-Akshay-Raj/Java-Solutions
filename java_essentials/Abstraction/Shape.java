package java_essentials.Abstraction;

public abstract class Shape {
  int edges;
  double perimeter;
  int sides;
  String color;
  public abstract double calculateArea();
  public void printMessage()
  {
    System.out.println("I'm a Shape");
  }
}
