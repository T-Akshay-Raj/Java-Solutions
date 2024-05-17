package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //Syntax for declaring an array
    int[] arr1; // or int arr[];
    //Ways to declare array : instantiating an array with the new keyword
    arr1 = new int[5];
    int[] arr2 = new int[5];

    //Ways to load data to array
    //1. Initialize an array in one line
    int[] arr3 = {1, 2, 3};
    int[] arr7=new int[]{1,2,3};
    String[] fruits = {"apple", "banana", "carrot"};

    // Ways to load data to array
    //2 : Using For loop
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = scan.nextInt();
    }

    //2: Using Arrays.fill
    Arrays.fill(arr2, 1); // Fills array with 1
    System.out.println("Using Arrays.fill");
    printArray(arr2);

    //3 Using Arrays.copyOf()
    int[] arr4 = Arrays.copyOf(arr2, 6);
    System.out.println("Arrays.copyOf");
    printArray(arr4);

    //4. Using Arrays.stream()
    int[] arr5 = Arrays.stream(arr4).toArray();
    System.out.println("Arrays.stream()");
    printArray(arr5);

    //5. Using Arrays.copyOfRange()
    int[] arr6=Arrays.copyOfRange(arr4,0,5);
    System.out.println("Using Arrays.copyOfRange");
    printArray(arr6);

  }


  //Ways to print array
  //1 : loop through an array with the for loop
  private static void printArray(int[] input) {
    System.out.println("loop through an array with the for loop");
    for (int i = 0; i < input.length; i++) {
      System.out.println(input[i]);
    }
  }

  //Ways to print array
  //2: loop through an array with the enhanced for loop
  private static void printArray(String[] input) {
    System.out.println("loop through an array with the enhanced for loop");
    for (String j : input) {
      System.out.println(j);
    }
  }

  //Ways to print array
  //3: Using Arrays.toString()
  private static void printArrayUsingArrays(String[] input) {
    System.out.println("Using Arrays.toString()");
    System.out.println(Arrays.toString(input));
  }
}
