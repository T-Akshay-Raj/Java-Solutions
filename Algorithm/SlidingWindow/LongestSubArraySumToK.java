package Algorithms.SlidingWindow;
/*
Given an array of positive integers nums and an integer k, find the length of the longest subarray whose sum is less than or equal to k.

Let's use an integer curr that tracks the sum of the current window. Since the problem wants subarrays whose sum is less than or equal to k, we want to maintain curr <= k. Let's look at an example where nums = [3, 1, 2, 7, 4, 2, 1, 1, 5] and k = 8.

 */
public class LongestSubArraySumToK {
  public static void main(String[] args) {
    int num[]= {3, 1, 2, 7, 4, 2, 1, 1, 5} ;
    int k = 8;
    System.out.println("Find Length of Longest SubArray whose sum to k is : "+findLongestSubArraySumToK(num,k));
  }

  private static int findLongestSubArraySumToK(int[] num, int k) {
    int left=0, curr=0, ans=0;
    for(int right=0;right<num.length;right++)
    { curr+=num[right];
      while(curr>k)
      {
        curr-=num[left];
        left++;
      }
      ans=Math.max(ans,right-left+1);
    }
    return ans;
  }
}
