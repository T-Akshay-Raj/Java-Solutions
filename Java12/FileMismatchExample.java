package Java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//Files.mismatch() method is a static method used to compare two files and return the position of the first mismatched byte in the files.
//If the files are identical, it returns -1.
//The method throws IOException if an I/O error occurs.
//The method is overloaded to take an optional max parameter to limit the number of bytes to compare.
//The method is available since Java 12.
//The method is useful to compare two files to check if they are identical or not.

//The method signature is as follows:
//public static long mismatch(Path path, Path path2) throws IOException
//public static long mismatch(Path path, Path path2, long max) throws IOException



public class FileMismatchExample {
  public static void main(String[] args) {

    Path path1 = Paths.get("file1.txt");
    Path path2 = Paths.get("file2.txt");
    try {
      long mismatch = Files.mismatch(path1, path2);
      if (mismatch == -1) {
        System.out.println("Files are identical");
      } else {
        System.out.println("Files differ at position " + mismatch);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
//create test methods



