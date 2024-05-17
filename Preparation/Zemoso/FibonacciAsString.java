package Preparation.Zemoso;

import java.util.Scanner;
//Given a number n, print Fibonacci series till n as Comma Separated and return as String
public class FibonacciAsString {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    System.out.println(fib(n));

  }

  private static String fib(int n) {
    StringBuilder sb=new StringBuilder();
    int a=0,b=1;
    for(int i=0;i<n;i++)
    {
      sb.append(a);
      if(i<n-1)
        sb.append(",");
      int c=a+b;
      a=b;
      b=c;
    }
    return sb.toString();
  }
}
