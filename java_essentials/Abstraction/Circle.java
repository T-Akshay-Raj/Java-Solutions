package java_essentials.Abstraction;

public class Circle extends Shape {
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  public void printMessage() {
    System.out.println("I'm a Circle");
  }
}
