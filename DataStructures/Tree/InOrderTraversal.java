package DataStructures.Tree;

import DataStructures.Tree.basic.Node;
import java.util.ArrayList;

public class InOrderTraversal {
  public static void main(String[] args) {
    Solution sol = new Solution();
    Node root = new Node(1);
    root.left = new Node(3);
    root.right = new Node(2);
    System.out.println(sol.inOrder(root));//Output: 3 1 2

    //Example 2:
    Node root1 = new Node(10);
    root1.left = new Node(20);
    root1.right = new Node(30);
    root1.left.left = new Node(40);
    root1.left.right = new Node(50);
    root1.right.left = new Node(60);

    System.out.println(sol.inOrder(root1)); //Output: 40 20 60 10 50 30
  }
}

class Solution {
  // Function to return a list containing the inorder traversal of the tree.
  ArrayList<Integer> inOrder(Node root) {
    // Code
    ArrayList<Integer> res = new ArrayList<>();
    getInOrder(root, res);
    return res;
  }

  private void getInOrder(Node root, ArrayList<Integer> res) {
    if (root == null) {
      return;
    }
    getInOrder(root.left, res);
    res.add(root.data);
    getInOrder(root.right, res);
  }
}
