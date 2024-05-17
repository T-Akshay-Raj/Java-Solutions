package Algorithms.Math;
/*
Given a binary number in the form of string, the task is to check whether the decimal representation of the given binary number is divisible by 10 or not. The number could be very large and may not fit even in long long int.

Example 1:

Input:
bin = "1010"
Output:
1
Explanation:
The decimal representation of given string is 10 which is divisible by 10.
So, answer is 1.
Example 2:

Input:
bin = "10"
Output:
0
Explanation:
The decimal representation of bin is
2, which is not divisible by 10, so
answer is 0.
 */
//Tip: A number is said to be divisible by 10 if its last digit is 0. Convert the  given binary input to decimal and check
public class DivisibleBy10 {
  public static void main(String[] args) {
    String s = "1010";
    String s1 = "10";
    String s2 = "01011011";
    String s3="01100000001110000001100110001111001001101001001001000011111001111010100000110011011000111110001100";

    System.out.println(s + " binary String is divisible by 10: " + isDivisibleBy10(s));
    System.out.println(s1 + " binary String is divisible by 10: " + isDivisibleBy10(s1));
    System.out.println(s2 + " binary String is divisible by 10: " + isDivisibleBy10(s2));
    System.out.println(s3 + " binary String is divisible by 10: " + isDivisibleBy10_2(s3));
  }
  //approach 1: Binary to Decimal Conversion Using parseInt()
  static int isDivisibleBy10(String bin) {
    // code here
    if(bin.charAt(bin.length()-1)=='1') return 0;
    int num=Integer.parseInt(bin,2);//Binary to Decimal
    return num%10==0?1:0;
  }

  //approach 2: Custom Method
    static int isDivisibleBy10_2(String bin) {
      // code here
      int remainder = 0;
      // Iterate over the binary digits of the input string
      for (int i = 0; i < bin.length(); i++) {
        // Convert the current binary digit to an integer
        char digit = bin.charAt(i);
        int num = Character.getNumericValue(digit);
        // Update the remainder by shifting the bits to the left by 1 position and adding the current binary digit
        remainder = (remainder * 2 + num) % 10;
      }
      // Return 1 if the remainder is 0 (i.e., the binary number is divisible by 10), otherwise return 0
      return remainder == 0?1:0;
    }

}
