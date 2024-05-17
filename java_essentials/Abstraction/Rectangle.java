package java_essentials.Abstraction;

public class Rectangle extends Shape {
  int breadth;
  int height;

  public Rectangle(int breadth, int height) {
    this.breadth = breadth;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return breadth * height;
  }
}
