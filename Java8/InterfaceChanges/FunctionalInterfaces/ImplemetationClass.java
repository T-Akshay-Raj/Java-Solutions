package Java8.FunctionalInterfaces;

public class ImplemetationClass implements CustomFunctionalInterface {
  public static void main(String[] args) {
    ImplemetationClass ic = new ImplemetationClass();
    ic.printMessage();

    //Using Lambda

  }

  @Override
  public void printMessage() {
    System.out.print("Hello User!");
  }


}
