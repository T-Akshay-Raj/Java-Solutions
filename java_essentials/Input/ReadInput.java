package java_essentials.Input;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadInput {
  public static void main(String[] args) throws IOException {
    //various methods to read input
    //1. Using Scanner class
    //2. Using BufferedReader class
    //3. Using Console class
    //4. Using System.in.read() method
    //5. Using DataInputStream class
    //6. Using Scanner class with custom delimiter
    //7. Using Scanner class with custom radix
    //8. Using Scanner class with custom radix and delimiter
    //9. Using Scanner class with custom locale
    //10. Using Scanner class with custom pattern
    //11. Using Scanner class with custom pattern and locale
    //12. Using Scanner class with custom pattern, locale and delimiter
    //13. Using Scanner class with custom pattern, locale, delimiter and radix
    //14. Using Scanner class with custom pattern, locale, delimiter, radix and input stream
    //15. Using Scanner class with custom pattern, locale, delimiter, radix, input stream and buffer size
    //16. Using Scanner class with custom pattern, locale, delimiter, radix, input stream, buffer size and read ahead limit
    //17. Using Scanner class with custom pattern, locale, delimiter, radix, input stream, buffer size, read ahead limit and input stream reader


    readInputUsingScanner();//Enter a number: 10, Entered number is: 10
    readInputUsingBufferedReader();//Enter a number: 20, Entered number is: 20
    readInputUsingConsole();//Enter your name: user, Entered name is:: user
    readInputUsingSystemInRead();//Enter a character: a, Entered character is: a
    readInputUsingDataInputStream();//Enter a number: 30, Entered number is: 30


  }

  //Using Scanner
  public static void readInputUsingScanner() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = scanner.nextInt();
    System.out.println("Entered number is: " + number);
    scanner.close();
  }

  //Using BufferedReader
  public static void readInputUsingBufferedReader() throws IOException {
    BufferedReader reader =
        new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a number: ");
    int number = Integer.parseInt(reader.readLine());
    System.out.println("Entered number is: " + number);
  }

  //Using System.in.read() method
  public static void readInputUsingSystemInRead() {
    System.out.println("Enter a character: ");
    try {
      char ch = (char) System.in.read();
      System.out.println("Entered character is: " + ch);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  //Using Console class
  public static void readInputUsingConsole() {
    Console console = System.console();
    if (console == null) {
      System.out.println("Console is not available");
      return;
    }
    String name = console.readLine("Enter your name: ");
    System.out.println("Entered name is: " + name);
  }

  //Using DataInputStream class
  public static void readInputUsingDataInputStream() throws IOException {
    DataInputStream dis = new DataInputStream(System.in);
    System.out.println("Enter a number: ");
    int number = dis.readInt();
    System.out.println("Entered number is: " + number);
  }
}
