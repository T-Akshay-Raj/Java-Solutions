package Algorithms.TwoPointer;

public class ContainerWithMostWater1 {
  public static void main(String[] args) {
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    System.out.println("Maximum area = " + maxArea(height));//Maximum area = 49

    int[] height1 = {1, 1};
    System.out.println("Maximum area = " + maxArea(height1));//Maximum area = 1

    int[] height2 = {2, 0};
    System.out.println("Maximum area = " + maxArea(height2));//Maximum area = 0

    int[] height3 = {1, 2, 1};
    System.out.println("Maximum area = " + maxArea(height3));//Maximum area = 2

    int[] height4 = {2, 3, 10, 5, 7, 8, 9};
    System.out.println("Maximum area = " + maxArea(height4));//Maximum area = 36

    int[] height5 = {1, 2};
    System.out.println("Maximum area = " + maxArea(height5));//Maximum area = 1

    int[] height6 = {2, 3, 4, 5, 18, 17, 6};
    System.out.println("Maximum area = " + maxArea(height6));//Maximum area = 17
  }

  private static int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int ans = 0;

    while (left < right) {
      int maxWater = Math.min(height[left], height[right]) * (right - left);
      ans = Math.max(ans, maxWater);
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return ans;
  }
}
