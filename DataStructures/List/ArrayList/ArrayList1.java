package DataStructures.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList1 {


  public static void main(String[] args) {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // DO NOT USE ARGUMENTS FOR INPUTS
    // E.g. 'Scanner' for input & 'System.out' for output
    Scanner scan = new Scanner(System.in);
    List<Integer> input = new ArrayList<>();
    int a;
    while (scan.hasNext()) {
      a = scan.nextInt();
      if (a < 0) {
        break;
      } else {
        input.add(a);
      }
    }
    printListElementsInReverseOrder(input);
  }

  private static void printListElementsInReverseOrder(List<Integer> input) {
    for (int i = input.size()-1; i >= 0; i--) {
      System.out.println(input.get(i));
    }
  }
}
