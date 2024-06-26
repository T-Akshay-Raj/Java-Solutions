package Algorithms.TwoPointer;
/*
392. Is Subsequence

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).


Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false


Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
*/


public class isSubSequence {
  public static void main(String[] args) {
    String s = "abc", t = "ahbgdc";
    Solution sol=new Solution();
    System.out.println(sol.isSubsequence(s,t));
  }
}

class Solution {
  public boolean isSubsequence(String s, String t) {
    int i=0,j=0;
  while(i<s.length() && j<t.length())
  {
    if(s.charAt(i)==s.charAt(j)){
      i++; //increment i only if there is a match
    }
    j++;
  }
  return i==s.length();//return check if is equals length of s. only then it means it has traversed through all characters of i
  }


//alternate approach:
    public boolean isSubsequence1(String s, String t) {
      if(s.length()==0){
        return true;
      }
      int i=0;
      int j=0;
      while(i<s.length() && j<t.length()){
        if(s.charAt(i)==t.charAt(j)){
          i++;
          j++;
        }else{
          j++;
        }
      }
      if(i==s.length()){
        return true;
      }else{
        return false;
      }
    }

}
