package Algorithms.TwoPointer;



//Check whether given string is Palindrome
// A string is a palindrome if it reads the same forward as backward. For example: "abcdcba", or "racecar".
public class Palindrome {
  public static void main(String[] args) {

    System.out.println(" The Given String ' abcdcba' is palindrome: "+checkPalindromeUsingTwoPointer("abcdcba"));
    System.out.println(" The Given String ' hello' is palindrome: "+checkPalindromeUsingTwoPointer("hello"));
    System.out.println(" The Given String ' racecar' is palindrome: "+checkPalindromeUsingTwoPointer("racecar"));
  }
  //Using two Pointer Approach
  private static boolean checkPalindromeUsingTwoPointer(String input) {
    int left = 0, right = input.length() - 1;
    while (left < right) {
      if (input.charAt(left) != input.charAt(right)) {
        return false;
      }
      left++; right--;
    }
    return true;
  }
}
