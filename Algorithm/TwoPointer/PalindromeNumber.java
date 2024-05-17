package Algorithms.TwoPointer;

/*
Given an integer x, return true if x is a palindrome , and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1

 */
public class PalindromeNumber {
  public static void main(String[] args) {
    System.out.println("Converting int to String and using two pointer to compare");
    System.out.println(isPalindromeNumber(121));
    System.out.println(isPalindromeNumber(-121));
    System.out.println(isPalindromeNumber(10));

    System.out.println("Approach 2: without using  extra space");
    System.out.println(isPalindrome(121));
    System.out.println(isPalindrome(-121));
    System.out.println(isPalindrome(10));
  }

  private static boolean isPalindromeNumber(int num) {
    if(num<0) return false;
    String str=String.valueOf(num);
    for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--)
    {
      if(str.charAt(i)!=str.charAt(j))
      {
        return false;
      }
    }
    return true;
  }

  //approach 2: Without using extra space and not converting to string
  private static boolean isPalindrome (int n1) {
    return getReverseInteger(n1) == n1;
  }

  private static int getReverseInteger (int n) {
    int nReversed = 0;
    while (n > 0) {
      int digit = n % 10;
      nReversed = nReversed * 10 + digit;
      n = (n - digit) / 10;
    }
    return nReversed;
  }


//approach 3
    private static  boolean isPalindrome2(int x) {
      if (x<0 || (x!=0 && x%10==0)) return false;
      int rev = 0;
      while (x>rev){
        rev = rev*10 + x%10;
        x = x/10;
      }
      return (x==rev || x==rev/10);
    }

}
