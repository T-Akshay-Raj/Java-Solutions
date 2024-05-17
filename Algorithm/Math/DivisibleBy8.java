package Algorithms.Math;

//Given a string representation of a decimal number s, check whether it is divisible by 8.
//
//Example 1:
//
//Input:
//s = "16"
//Output:
//1
//Explanation:
//The given number is divisible by 8,
//so the driver code prints 1 as the output.
//Example 2:
//
//Input:
//s = "54141111648421214584416464555"
//Output:
//-1
//Explanation:
//Given Number is not divisible by 8,
//so the driver code prints -1 as the output.
//Tip: A Number is said to be divisible by 8 if its last three digits are 000 or are divisible by 8
public class DivisibleBy8 {
  public static void main(String[] args) {
    String s = "16";
    String s1 = "54141111648421214584416464555";
    System.out.println(s + " is divisible by 8: " + DivisibleByEight(s));
    System.out.println(s1 + " is divisible by 8: " + DivisibleByEight(s1));
  }

  private static int DivisibleByEight(String s) {
    int num = Integer.parseInt(s.substring(Math.max(0, s.length() - 3)));//getting last 3 digits of the number
    return num % 8 == 0 ? 1 : -1 ;
  }

}
