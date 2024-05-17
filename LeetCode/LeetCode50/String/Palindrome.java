package LeetCode.LeetCode50.String;
import java.util.stream.IntStream;
public class Palindrome {
    public static boolean isPalindrome(String text) {
      String temp = text.replaceAll("\\s+", "").toLowerCase();
      return IntStream.range(0, temp.length() / 2)
          .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

    public static void main(String[] args) {
      String testString = "A man a plan a canal Panama";
      System.out.println("Is palindrome: " + isPalindrome(testString));//true
    }
  }

