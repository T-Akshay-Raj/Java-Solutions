package Algorithms.Math;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
import java.util.Timer;

//Fibonacci Series in Java
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner scan=new Scanner((System.in));
    int n=scan.nextInt();
    Instant start = Instant.now();
    System.out.println(("fibonacci using recursion: "+fibUsingRecursion(n)));
    Instant finish = Instant.now();
    long duration= Duration.between(start,finish).toMillis();
    System.out.println( "timeElapsed = "+(duration));

    System.out.println(("fibonacci using Iteration: "+fibUsingIteration(n)));

  }
  //Using recursion
  private static int fibUsingRecursion(int n) {
    if (n == 1 || n == 0) {
      return n;}
    return fibUsingRecursion(n-1)+fibUsingRecursion(n-2);
  }

  //using iteration and storing fib(n-1) and fib(n-2)
  private static int fibUsingIteration(int n) {
    if (n == 1 || n == 0) {
      return n;}
   int n1=0,n2=1;
    int tempN=0;
    for(int i=2;i<=n;i++)
    {
      tempN=n1+n2;
      n1=n2;
      n2=tempN;
    }
    return n2;
  }


  //USing java8

}
