package Java11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileExample {
  public static void main(String[] args) throws IOException {
    System.out.println("File Operations after Java 11");
    System.out.println("Read Operation");
    System.out.println(readString1(new File("example.txt")));

    System.out.println("Write Operation");
    writeString("Hello");

  }

  static String readString1(File file) throws IOException {
    return Files.readString(Path.of(file.toURI()));
  }

  public static void writeString(String fileContent) throws IOException {
    Files.writeString(Paths.get("exampleWrite.txt"), fileContent,
        StandardOpenOption.CREATE);
  }
}
