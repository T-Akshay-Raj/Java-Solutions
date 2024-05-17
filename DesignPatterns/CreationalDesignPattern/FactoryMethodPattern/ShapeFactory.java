package DesignPatterns.CreationalDesignPattern.FactoryMethodPattern;

public class ShapeFactory {
  public Shape createShape(String type) {
    if (type.equalsIgnoreCase("circle")) {
      return new Circle(10);
    } else if (type.equalsIgnoreCase("rectangle")) {
      return new Rectangle(3,5);
    } else if (type.equalsIgnoreCase("square")) {
      return new Square(3);
    }
    return null;
  }
}
