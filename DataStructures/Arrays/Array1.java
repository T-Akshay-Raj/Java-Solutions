package DataStructures.Arrays;

import java.util.Scanner;
//Task: Take N integers as an input and store them in an array and then print the array in reverse format.
public class Array1 {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int size=scan.nextInt();
    int[] inputArray=new int[size];
    for(int i=0;i<size;i++)
    {
      inputArray[i]=scan.nextInt();
    }
    for(int j=size-1;j>=0;j--){
      System.out.println(inputArray[j]);
    }
  }
}
/*
Example Input

Input 1:

 5
 2
 1
 11
 13
 14
Input 2:

 2
 12
 11


Example Output

Output 1:

 14
 13
 11
 1
 2
Output 2:

 11
 12
 */