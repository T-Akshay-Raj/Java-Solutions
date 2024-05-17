package DataStructures.Tree;
/*
Given the root of a Binary Search Tree. The task is to find the minimum valued element in this given BST.

Example 1:
Input:
           5
         /    \
        4      6
       /        \
      3          7
     /
    1
Output: 1

Example 2:
Input:
             9
              \
               10
                \
                 11
Output: 9
Your Task:
The task is to complete the function minValue() which takes root as the argument and returns the minimum element of BST. If the tree is empty, there is no minimum element, so return -1 in that case.

Expected Time Complexity: O(Height of the BST)
Expected Auxiliary Space: O(1).

Constraints:
0 <= n <= 104

Company Tags: Microsoft
Topic Tags: Binary Search Tree, Tree, Data Structures
 */
import DataStructures.Tree.basic.Node;

public class MinimumElementInTree {
  public static void main(String[] args) {
    Node tree = new Node(5);
    tree.left = new Node(4);
    tree.right = new Node(6);
    tree.left.left = new Node(3);
    tree.right.right = new Node(7);
    tree.left.left.left = new Node(1);

    Solution7 sol = new Solution7();
    System.out.println(sol.minValue(tree));

  }
}

class Solution7 {
  // Function to find the minimum element in the given BST.
  int minValue(Node node) {
    return findMin(node, node.data);
  }

  private int findMin(Node node, int min) {
    if (node == null) {
      return min;
    }
    if (min > node.data) min = node.data;
    int lmin=findMin(node.left, min);
    int rmin=findMin(node.right, min);
    return Math.min(min,Math.min(lmin,rmin));
  }
}

