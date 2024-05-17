package GeeksForGeeks.ProblemOfTheDay;

/*
Given a square matrix a of size n x n, where each cell can be either 'X' or 'O', you need to find the size of the largest square subgrid that is completely surrounded by 'X'. More formally you need to find the largest square within the grid where all its border cells are 'X'.

Input 1:
n = 2
a = [[X,X],
     [X,X]]
 */
public class LargestSubsquareSurroundedByX {
  public static void main(String[] args) {
    int n = 2;
    char[][] a = {{'X', 'X'}, {'X', 'X'}};
    LargestSubsquareSurroundedByX obj = new LargestSubsquareSurroundedByX();
    System.out.println(obj.largestSubsquare(n, a));

  }

  int largestSubsquare(int n, char a[][]) {
    // code here
    int max = 0;
    //code to check for largest sub square surrounded by x  in a matrix of x and o  and return the size of the largest sub square surrounded by x in the matrix
    int dp[][] = new int[n][n];

    for (int i = 0; i < n; i++) {
      if (a[n - 1][i] == 'X') {
        dp[n - 1][i] = 1;
      } else {
        dp[n - 1][i] = 0;
      }
    }


    return max;
  }
}
