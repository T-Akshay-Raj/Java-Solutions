package Java11;

public class StringClassMethods {
  public static void main(String[] args) {
    //new String methods introduced in java 11
    //strip() method removes white spaces from both ends of the string
    System.out.println("strip() : " + " Hello ".strip());//Hello

    //stripTrailing() method removes white spaces from the end of the string
    System.out.println("stripTrailing() : " + "  Hello  ".stripTrailing());//  Hello

    //stripLeading() method removes white spaces from the beginning of the string
    System.out.println("stripLeading() : " + "  Hello  ".stripLeading());//Hello

    //isBlank() method returns true if the string is empty or contains only white spaces
    System.out.println("isBlank() : " + "  Hello  ".isBlank());//false
    System.out.println("isBlank() : " + "     ".isBlank());//True

    //repeat() method returns a string whose value is the concatenation of given string repeated count times
    System.out.println("repeat() : " + " Hello ".repeat(2));//Hello Hello

    //lines() method returns a stream of lines extracted from the string
    String str1 = "Hello\nWorld\nJava";
    str1.lines().forEach(System.out::println);//Hello World Java

    //indent() method returns a string whose each line is indented by given number of spaces
    System.out.println("indent() : " + str1.indent(2)); //  Hello\n  World\n  Java


    //transform() method returns a string whose value is the result of applying the given function to the string
    System.out.println("transform() : " + "Hello".transform(s -> s + " 11"));//Hello 11
    //transform() method prior to java 11 was being done as
    System.out.println("transform() : " + "Hello".concat(" 11"));//Hello 11


    //formatted() method returns a formatted string using the given format string and arguments
    System.out.println("formatted() : " + "Hello %s".formatted("Java"));//Hello Java
    //formatted() method prior to java 11 was being done as
    System.out.println("formatted() : " + String.format("Hello %s", "Java"));//Hello Java

    //translateEscapes() method returns a string whose value is the result of replacing the escape sequences with their values
    System.out.println("translateEscapes() : " + "Hello \\n World".translateEscapes());//Hello \n World
    // translateEscapes() method prior to java 11 was being done as
    System.out.println("translateEscapes() : " + "Hello \\n World".replace("\\n", "\n"));//Hello \n World


    //stripIndent() method returns a string whose each line is indented by the minimum number of leading white spaces
    String str2 = "  Hello\n  World\n  Java";
    System.out.println("stripIndent() : " + str2.stripIndent()); //Hello\nWorld\nJava
    //stripIndent() method prior to java 11 was being done as
    System.out.println("stripIndent() : " + str2.replaceAll("\n  ", "\n"));//Hello\nWorld\nJava

  }
}
