package DataStructures.Tree;

/*
LeetCode 543. Diameter of Binary Tree

Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.


Example 1:
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

Example 2:
Input: root = [1,2]
Output: 1

Constraints:
The number of nodes in the tree is in the range [1, 104].
-100 <= Node.val <= 100
 */
public class DiameterOfTree {
  public static void main(String[] args) {
    //Input: root = [1,2,3,4,5]

    TreeNode tree = new TreeNode(1);
    tree.left = new TreeNode(2);
    tree.right = new TreeNode(3);
    tree.left.left = new TreeNode(4);
    tree.left.right = new TreeNode(5);

    System.out.println(
        "Diameter of the Tree is : " + diameterOfBinaryTree(tree));
  }

  private static int diameterOfBinaryTree(TreeNode tree) {
    if (tree == null) {
      return 0;
    }
    int lHeight = height(tree.left);
    int rHeight = height(tree.right);

    int lDiameter = diameterOfBinaryTree(tree.left);
    int rDiameter = diameterOfBinaryTree(tree.right);
    return Math.max(Math.max(lDiameter, rDiameter), lHeight + rHeight + 1);
  }

  private static int height(TreeNode node) {
    if (node == null) {
      return 0;
    }
    int lHeight = height(node.left);
    int rHeight = height(node.right);

    return lHeight > rHeight ? lHeight + 1 : rHeight + 1;

  }


}

