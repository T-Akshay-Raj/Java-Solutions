package DataStructures.Tree;

import DataStructures.Tree.basic.TreeNode;

public class SumOAllNodes {
  public static void main(String[] args) {
    Solution1 sol = new Solution1();

    //Example 1:
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(4);
    root.right = new TreeNode(6);
    System.out.println(sol.sumNumbers(root));//Output: 20

    //Example 2:
    TreeNode root1 = new TreeNode(4);
    root1.left = new TreeNode(9);
    root1.right = new TreeNode(0);
    root1.left.left = new TreeNode(5);
    root1.left.right = new TreeNode(1);

    System.out.println(sol.sumNumbers(root1)); //Output: 19

  }
}

class Solution1 {
  public int sumNumbers(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return root.val + sumNumbers(root.left) + sumNumbers(root.right);
  }
}
