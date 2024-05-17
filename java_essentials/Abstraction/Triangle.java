package java_essentials.Abstraction;

public class Triangle extends Shape {
  int breadth;
  int height;
  @Override
  public double calculateArea() {
    return 1/2 * (breadth * height);
  }
}
