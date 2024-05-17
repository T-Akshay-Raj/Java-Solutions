package Algorithms.SlidingWindow;

public class LargestSumFromSubArrayWithKELements {
  public static void main(String[] args) {
    int []nums = {10,5,2,6};
    int k = 2;
    System.out.println(largestSumFromSubArrayWithKELements(nums,k));
  }

  private static int largestSumFromSubArrayWithKELements(int[] nums, int k) {
    int curr=0, ans=0;
    for(int i=0;i<k;i++)
    {
      curr+=nums[i];
    }
    ans=curr;
    for(int j=k;j<nums.length;j++)
    {
      curr+=nums[j]-nums[j-2];
      ans=Math.max(curr,ans);
    }
    return ans;
  }
}
