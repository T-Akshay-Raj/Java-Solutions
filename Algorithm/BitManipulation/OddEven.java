package Algorithms.BitManipulation;

public class OddEven {
  public static void main(String[] args) {
    System.out.println(OddEven.isOddOrEven(2));
    System.out.println(OddEven.isOddOrEven(7));
  }
//Using Bitwise AND Operation
  private static String isOddOrEven(int n) {
    return ((n & 1) == 0) ? "Even" : "Odd"; // Bitwise AND operation with a number will result 0 if even
    //Explanation: Binary Representation of 2 is 0010 and 1 is 0001 , For AND Operation, 1 & 1 = 1 else 1 (i.e; True AND True =True)
  }
}
