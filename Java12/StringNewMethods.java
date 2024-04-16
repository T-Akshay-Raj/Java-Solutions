package Java12;

public class StringNewMethods {
  public static void main(String[] args) {
    //new String methods introduced in java 12
    //indent(int n) method is used to return a string whose value is the concatenation of the specified string repeated n times.
    //If n is negative, then the method returns the original string.

    String str = "Hello";
    System.out.println(str.indent(5));//"     Hello"
    System.out.println(str.indent(-5));//"Hello"

    //transform(Function<? super String, ? extends R> f) method is used to return a string whose value is the result of applying the given function to the string.
    //The given function should not be null.
    str = str.transform(s -> s + " World");
    System.out.println(str);//"Hello World"

    //list all new string method introduced in java 12
    //1. indent(int n) method
    //2. transform(Function<? super String, ? extends R> f) method




  }
}
