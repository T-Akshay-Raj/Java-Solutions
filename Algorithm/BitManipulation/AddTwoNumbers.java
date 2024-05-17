package Algorithms.BitManipulation;

/*
Add two numbers without using arithmetic operators

Write a function Add() that returns sum of two integers. The function should not use any of the arithmetic operators (+, ++, –, -, .. etc).
 */
public class AddTwoNumbers {
  public static void main(String[] args) {
    int a = 10, b = 20;
    System.out.println("Addition of Two numbers is : " + addTwoNumbers(a, b));
    System.out.println("Addition of Two numbers is : " + addTwoNumbers(2, 3));
    System.out.println("Addition of Two numbers is : " + addTwoNumbers(20, 30));

    System.out.println("Addition of Two numbers is : " + addTwoNumbers1(a, b));
    System.out.println("Addition of Two numbers is : " + addTwoNumbers1(2, 3));
    System.out.println("Addition of Two numbers is : " + addTwoNumbers1(20, 30));
  }

  /*
  Approach
  Using bitwise "XOR" and "AND" operations to perform operation. "XOR" and "AND" operation produce the sum and carry of the binary addition respectively.
  a XOR b (a ^ b): form bitwise sum of a+b w/o carry
  a AND b (a & b): form bitwise carry of a+b
  a + b = a XOR b + ((a AND b) << 1)

   */
  private static int addTwoNumbers(int a, int b) {
    return (a ^ b + ((a & b) << 1));
  }

  ////we can calculate like adder or summer in digit circut
  //// A	B	C	S
  //// 0	0	0	0
  //// 1	0	0	1
  //// 0	1	0	1
  //// 1	1	1	0
  ////c means carry,we can get c using "&"(and) operator;s means sum,we can get s using "^"(xor)
  ////our final result could be calculated by 2*carry+s,and we can use recursion to replace the "+" operator
  private static int addTwoNumbers1(int a, int b) {
    return ((a ^ b) + 2 * (a & b));
  }


}
