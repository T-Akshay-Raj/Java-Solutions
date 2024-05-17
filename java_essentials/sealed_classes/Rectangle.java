package java_essentials.sealed_classes;

sealed class Rectangle extends Shape permits Square {
  public void printMessage() {
    System.out.println("This is Rectangle Class");
  }
}
