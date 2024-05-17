package DataStructures.Tree;

import DataStructures.Tree.basic.Node;

/*
Given a Binary Tree, find maximum and minimum elements in it.
Example 1:
Input:
		       2
	      /     \
	     7	     5
	      \        \
		      6	      9
	      /	  \    /
 	     1     11  4
Output: 11 1
Explanation:
 The maximum and minimum element in this binary tree is 11 and 1 respectively.

Example 2:
Input:
           6
        / \
       5   8
      /
     2
Output: 8 2
Your Task:
You don't need to read input or print anything. Your task is to complete findMax() and findMin() functions which take root node of the tree as input parameter and return the maximum and minimum elements in the binary tree respectively.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)


Constraints:
1 <= Number of nodes <= 105
1 <= Data of a node <= 105

Topic Tags: Tree, Data Structures
 */
public class MaxAndMinBinaryTree {
  public static void main(String[] args) {

    //Example 1:
    Node tree = new Node(2);
    tree.left = new Node(7);
    tree.right = new Node(5);
    tree.left.right = new Node(6);
    tree.right.right = new Node(9);
    tree.left.right.left = new Node(1);
    tree.left.right.right = new Node(11);
    tree.right.right.left = new Node(4);

    System.out.println(Solution8.findMin(tree)); // 1
    System.out.println(Solution8.findMax(tree)); // 11

    //Example 2:
    Node tree1 = new Node(6);
    tree1.left = new Node(5);
    tree1.right = new Node(8);
    tree1.left.left = new Node(2);
    System.out.println(Solution8.findMin(tree1)); // 2
    System.out.println(Solution8.findMax(tree1)); // 8
  }
}

class Solution8 {
  public static int findMax(Node root) {
    //code here
    return getMax(root, root.data);
  }

  private static int getMax(Node root, int max) {
    if (root == null) {
      return max;
    }
    if (max < root.data) {
      max = root.data;
    }
    int lMax = getMax(root.left, max);
    int rMax = getMax(root.right, max);
    return Math.max(max, Math.max(lMax, rMax));
  }


  public static int findMin(Node root) {
    //code here
    return getMin(root, root.data);
  }

  private static int getMin(Node root, int min) {
    if (root == null) {
      return min;
    }
    if (min > root.data) {
      min = root.data;
    }
    int lMin = getMin(root.left, min);
    int rMin = getMin(root.right, min);
    return Math.min(min, Math.min(lMin, rMin));
  }
}
