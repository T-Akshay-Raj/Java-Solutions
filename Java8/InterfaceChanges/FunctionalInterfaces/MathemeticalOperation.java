package Java8.FunctionalInterfaces;

public class MathemeticalOperation implements Operation {
  public static void main(String[] args) {

    int x = 10, y = 20;

    //Find Sum
    MathemeticalOperation mo = new MathemeticalOperation();
    System.out.println("Sum of given number is : " + mo.performOperation(x, y));

    ///When I have to calculate difference or multiply or division of those 2 numbers i would need multiple methods
    //Here I use functional Interface without need to declare each method
    //For Multiple


  }


  @Override
  public int performOperation(int a, int b) {
    return a + b;
  }


}
