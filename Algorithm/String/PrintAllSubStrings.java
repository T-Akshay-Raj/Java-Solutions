package Algorithms.String;

public class PrintAllSubStrings {
  public static void main(String[] args) {
    String s = "abcd";

    System.out.println("All SubStrings of string: ");
    printAllSubstrings(s);
  }

  //Using SubString() method of String class
//  Time complexity: O( n^3 )
//  Auxiliary Space: O(1)
  private static void printAllSubstrings(String s) {
    for(int i=0;i<s.length();i++)
    {
      for(int j=i+1;j<s.length();j++)
      {
        System.out.println(s.substring(i,j));
      }
    }

  }
}
//a
//ab
//abc
//b
//bc
//c