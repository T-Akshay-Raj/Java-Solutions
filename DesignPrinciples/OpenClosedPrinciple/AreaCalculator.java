package DesignPrinciples.OpenClosedPrinciple;

import java.util.Arrays;
import java.util.List;

public class AreaCalculator {
  public static void main(String[] args) {
    AreaCalculator areaCalculator = new AreaCalculator();
    Circle circle = new Circle(5);
    Rectangle rectangle = new Rectangle(10, 5);
    Square square = new Square(4);
    System.out.println("Area of Circle: " + areaCalculator.calculateArea(circle));
    System.out.println("Area of Rectangle: " + areaCalculator.calculateArea(rectangle));
    System.out.println("Area of Square: " + areaCalculator.calculateArea(square));

    // List of shapes
    List<Shape> shapes = Arrays.asList(circle, rectangle, square);
    System.out.println("Total Area of all shapes: " + areaCalculator.calculateTotalArea(shapes));
  }
  public double calculateArea(Shape shape) {
    return shape.calculateArea();
  }

  public double calculateTotalArea(List<Shape> shapes) {
    double totalArea = 0;
    for (Shape shape : shapes) {
      totalArea += shape.calculateArea();
    }
    return totalArea;
  }
}
