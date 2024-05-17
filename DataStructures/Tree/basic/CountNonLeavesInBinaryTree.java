package DataStructures.Tree.basic;
/*
Count Non-Leaf Nodes in Tree
Difficulty: Basic
Given a Binary Tree of size N, your task is to complete the function countNonLeafNodes(), that should return the count of all the non-leaf nodes of the given binary tree.

Example:

Input: 1 2 3 4 5

Output: 2
Explanation:
Nodes 1 and 2 are the only non leaf nodes.
Your Task:
You don't need to take input or print anything. Your task is to complete the function countNonLeafNodes() that takes root as input and returns the number of non leaf nodes in the tree.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 ≤ Number of nodes ≤ 105

Topic Tags
TreeData Structures

 */

public class CountNonLeavesInBinaryTree {
  public static void main(String[] args) {
    Solution sol = new Solution();
    Node root = new Node(10);
    root.left = new Node(4);
    root.right = new Node(6);
    System.out.println(sol.countNonLeafNodes(root));//Output: 1

    //Example 2:
    Node root1 = new Node(4);
    root1.left = new Node(8);
    root1.right = new Node(10);
    root1.left.left = new Node(7);
    root1.right.left = new Node(5);
    root1.right.right = new Node(1);
    root1.left.left.left = new Node(3);

    System.out.println(sol.countNonLeafNodes(root1)); //Output: 4
  }
}

class Solution {
  int countNonLeafNodes(Node root) {
    //code here
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 0;
    }
    return 1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right);
  }
}

