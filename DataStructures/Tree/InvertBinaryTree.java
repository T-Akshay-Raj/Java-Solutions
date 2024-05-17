package DataStructures.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
226. Invert Binary Tree
Difficulty: Easy

Given the root of a binary tree, invert the tree, and return its root.

Example 1:
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]

Example 2:
Input: root = [2,1,3]
Output: [2,3,1]

Example 3:
Input: root = []
Output: []


Constraints:
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100


Topics: Tree, Depth-First Search, Breadth-First Search, Binary Tree
 */
public class InvertBinaryTree {
  public static void main(String[] args) {

  }

  // recursively
  public TreeNode invertTree1(TreeNode root) {
    if (root == null) {
      return null;
    }
    TreeNode node = invertTree1(root.left);
    root.left = invertTree1(root.right);
    root.right = node;
    return root;
  }

  // iteratively, using Queue
  public TreeNode invertTree2(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node != null) {
        queue.add(node.left);
        queue.add(node.right);
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
      }
    }
    return root;
  }


  // iteratively, using Stack
  public TreeNode invertTree3(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      if (node != null) {
        stack.push(node.right);
        stack.push(node.left);
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
      }
    }
    return root;
  }
}
