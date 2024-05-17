package Java7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileExample {
  public static void main(String[] args) {
//Approach 1:
    System.out.println(
        "File Copy using FileReader, BufferedReader and FileWriter");
    fileCopy();
//Approach 2:
    System.out.println("File Copy using Files.copy()");
    fileCopy2();
  }

  //File Copy Approach 1
  static void fileCopy() {
    String sourceFile = "C:\\fullpath\\files\\input.txt";
    String targetFile = "C:\\fullpath\\output.txt";

    try (FileReader fr = new FileReader(sourceFile);
         BufferedReader br = new BufferedReader(fr);
         FileWriter fw = new FileWriter(targetFile)) {
      while (true) {
        String line = br.readLine();
        if (line == null) {break;}
        fw.write(line + "\n");
      }
      System.out.println("File Copied Successfully");

    } catch (FileNotFoundException fe) {
      System.out.println("File not found: " + fe.getMessage());
    } catch (IOException io) {
      System.out.println(
          "Error Occurred During writing to file." + io.getMessage());
    } catch (Exception e) {
      System.out.println("Other Exception occurred. " + e.getMessage());
    }
  }

  //File Copy Approach 2
  static void fileCopy2() {
    Path source = Paths.get("C:\\PATH\\files", "input.txt");
    Path target = Paths.get("C:\\PATH\\files", "target2.txt");
    try {
      Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
      System.out.println("File Copied Successfully");
    } catch (IOException io) {
      System.out.println("Error Occurred: " + io.getMessage());
    }
  }

}
