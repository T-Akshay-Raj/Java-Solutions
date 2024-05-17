package DataStructures.Arrays.MultiDimensionalArray;

import java.util.Scanner;

/*Task:

Take 2D matrix A of size N X M as an input and print M integers denoting the column-wise sum of each of the M columns.


Problem Constraints

1 <= N, M <= 103

1 <= A[i][j] <= 100

 */
//A multidimensional array is an array of arrays. Each element of a multidimensional array is an array itself.
public class MultiDimmensionalArray {
  public static void main(String[] args) {
    //declare
    int[][] arr = new int[3][4];

    String[][][] names = new String[3][4][2];
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int[][] multiArray = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        multiArray[i][j] = scan.nextInt();
      }
    }
    printColumnWiseSum(multiArray, n, m);
  }

  private static void printColumnWiseSum(int[][] multiArray, int rows,
                                         int columns) {
    int sum = 0, i = 0;
    for (int j = 0; j < columns; j++) {
      while (i < rows) {
        sum += multiArray[i][j];
        i++;
      }
      System.out.print(sum + " ");
      i = 0;
      sum = 0;

    }
  }
}

/*
Input:
3 4
3 2 1 3
1 2 3 4
4 3 1 2

output:
8 7 5 9
 */