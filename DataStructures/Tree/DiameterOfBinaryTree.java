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

public class DiameterOfBinaryTree {
  public static void main(String[] args) {
    //Input: root = [1,2,3,4,5]

    TreeNode tree= new TreeNode(1);
    tree.left = new TreeNode(2);
    tree.right = new TreeNode(3);
    tree.left.left = new TreeNode(4);
    tree.left.right = new TreeNode(5);

    Solution4
        sol=new Solution4();
    System.out.println(sol.diameterOfBinaryTree(tree));
  }
}
class Solution4 {
  public int diameterOfBinaryTree(TreeNode root) {
    if(root==null)
    {
      return 0;
    }
    else{
      int lDepth=diameterOfBinaryTree(root.left);
      int rDepth=diameterOfBinaryTree(root.right);

      /* use the larger one */
      if (lDepth > rDepth)
        return (lDepth + 1);
      else
        return (rDepth + 1);
    }
  }
}
