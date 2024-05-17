package Algorithms.BitManipulation;
//Swap variable without using third variable or any arithmetic operation(+-*/)
public class SwapTwoNumbers {
  public static void main(String[] args) {
    int a=10,b=20;
    System.out.println("Before Swapping: a= "+a+" and b= "+b);
    //Using Bit Manipulation to swap variable
    //a=10 its binary is 1010 and b=20 its binary is 10100

    a=a^b;
    b=a^b;
    a=a^b;

    System.out.println("After Swapping: a= "+a+" and b= "+b);

  }
}
