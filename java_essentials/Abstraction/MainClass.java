package java_essentials.Abstraction;

public class MainClass {
  public static void main(String[] args) {

    Circle c = new Circle(5);
    System.out.println(c.calculateArea());//78.53981633974483
    c.printMessage();//I'm a Circle
    //Shape s=new Shape();//Shape is an Abstract class cannot be Instantiated

    Shape s1 = new Circle(10);
    System.out.println(s1.calculateArea());
    s1.printMessage();//I'm a Circle
}

}
