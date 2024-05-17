//package Java7.files;
//
//import java.io.File;
//import java.io.IOException;
//import org.apache.commons.io.FileUtils;
//
//public class FileCopyUsingApacheCommons {
//  public static void main(String[] args) {
//    //Step 1: Add jar to project
//    System.out.println("Copy files using apache utils");
//    fileCopyUsingApache();
//
//  }
//
//  static void fileCopyUsingApache() {
//    File source =
//        new File("C:\\PATH\\files\\input.txt");
//    File target =
//        new File("C:\\PATH\\files\\target3.txt");
//    try {
//      FileUtils.copyFile(source, target);
//      System.out.println("File Copied Successfully");
//    } catch (IOException io) {
//      System.out.println("Error Occurred: " + io.getMessage());
//    }
//  }
//}
