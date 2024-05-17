package Algorithms.TwoPointer;

public class ContainerWithMostWater {
  public static void main(String[] args) {
//    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//    System.out.println("Maximum area = " + maxArea(height));//Maximum area = 49
//
//    int[] height1 = {1, 1};
//    System.out.println("Maximum area = " + maxArea(height1));//Maximum area = 1
//
//    int[] height2 = {2,0};
//    System.out.println("Maximum area = " + maxArea(height2));//Maximum area = 0
//
//    int[] height3 = {1,2,1};
//    System.out.println("Maximum area = " + maxArea(height3));//Maximum area = 2
//
//    int[] height4 = {2,3,10,5,7,8,9};
//    System.out.println("Maximum area = " + maxArea(height4));//Maximum area = 36
//
//    int[] height5 = {1,2};
//    System.out.println("Maximum area = " + maxArea(height5));//Maximum area = 1

    int[] height6={2,3,4,5,18,17,6};
    System.out.println("Maximum area = " + maxArea(height6));//Maximum area = 17
  }

  private static int maxArea(int[] height) {
    int maxArea = 0;
    int i = 0, j = height.length - 1;
    int currentArea=0;
    int nextArea=0;
    int prevArea=0;
    while(i< height.length && j>=0)
    {
      System.out.println("i = " + i + " j = " + j);
      if(height[i]==0 || height[j]==0)
      {
        i++;
        j--;
        continue;
      }
      currentArea = Math.min(height[i],height[j])*(Math.abs(j-i));
      System.out.println("currentArea = " + currentArea);
      nextArea = Math.min(height[i+1],height[j])*(Math.abs(j-i-1));
      System.out.println("nextArea = " + nextArea);
      prevArea = Math.min(height[i],height[j-1])*(Math.abs(j-1-i));
      System.out.println("prevArea = " + prevArea);
     if(currentArea<nextArea)
     {
       maxArea = Math.max(nextArea,prevArea);
       i++;
     }
     else{
        maxArea = Math.max(maxArea,currentArea);
        j--;
     }
    }
    return maxArea;
  }
}
