public class StringReverse {
  public static void main(String[] args) {
    String str="Hello String";
    System.out.println("Reverse a String using Streams API: "+reverseStringUsingStreams(str)); //gnirtS olleH
  }

  private static String reverseStringUsingStreams(String str) {
    return Stream.of(str).map(string->new StringBuilder(str).reverse()).collect(
        Collectors.joining());
  }
}
