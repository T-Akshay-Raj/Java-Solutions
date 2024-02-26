package Strings;


import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a string, write a program to reverse the string
public class StringReverse {
  public static void main(String[] args) {
    String str="Hello Strings";
    System.out.println("Reverse a String using Traditional forloop : "+reverseStringTraditional(str));
    System.out.println("Reverse a String using Traditional forloop and extra space for charArray : "+reverseStringTraditional2(str));
    System.out.println("Reverse String using Stringbuilder.reverse(): "+reverseStringUsingStringBuilder(str));
    System.out.println("Reverse String using Stringbuffer.reverse(): "+reverseStringUsingStringBuffer(str));

    System.out.println("Reverse String using chars(): "+reverseStringUsingChars(str));
    System.out.println("Reverse String using Streams.of(): "+reverseStringUsingStreams(str));
  }


  private static String reverseStringTraditional(String str) {
    StringBuilder out=new StringBuilder();
    for(int i=str.length()-1;i>=0;i--)
      out.append(str.charAt(i));
    return String.valueOf(out);
  }
  private static String reverseStringTraditional2(String str) {
    char[] input=str.toCharArray(); //Using extra space for a character array of size string
    StringBuilder res=new StringBuilder();
    for(int j= input.length-1;j>=0;j--)
    {
      res.append(input[j]);
    }
    return String.valueOf(res);
  }



  //StringBuffer are thread safe hence slow
  private static String reverseStringUsingStringBuffer(String str) {
    if (str == null) {
      return null;
    }
    StringBuffer out=new StringBuffer(str);
    return out.reverse().toString();
  }

  //Using StringBuilder.reverse()
  private static String reverseStringUsingStringBuilder(String str) {
    return new StringBuilder(str).reverse().toString();
  }

  //Using String chars()
  private static String reverseStringUsingChars(String str){
    return str.chars()
        .mapToObj(c -> (char) c)
        .reduce("", (a, b) -> b + a, (a2, b2) -> b2 + a2);
  }

  //Using Stream.of()
  private static String reverseStringUsingStreams(String str) {
    return Stream.of(str).map(string->new StringBuilder(str).reverse()).collect(Collectors.joining());
  }
}
