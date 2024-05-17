package Strings;
//Given a Sentence, return reverse of each word from the sentence
//eg: String s = "david is a great worker";
public class StringReverseSentence {

  public static void main(String[] args) {
    String s = "david is a great worker";
    System.out.println(StringReverseSentence.reverseEachWord(s));
  }

  // Change these boolean values to control whether you see
  // the expected result and/or hints.
  static boolean showExpectedResult = false;
  static boolean showHints = false;

  private static String reverse(String word) {
    StringBuilder sb = new StringBuilder(word);
    return sb.reverse().toString();
  }

  public static String reverseEachWord(String sentence) {
    // Your code goes here.
    if (sentence == null || sentence.isEmpty()) {
      return sentence;
    }
    String[] str = sentence.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String inputStr : str) {
      sb.append(reverse(inputStr));
      sb.append(" ");
    }
    return String.valueOf(sb);
  }

  }
