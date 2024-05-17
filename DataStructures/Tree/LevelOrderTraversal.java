package DataStructures.Tree;

import DataStructures.Tree.basic.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    System.out.println(Solution6.levelOrder(root)); // 1 2 3 4 5

    //Example 2:
    Node root1 = new Node(1);
    root1.left = new Node(3);
    root1.right = new Node(2);
    System.out.println(Solution6.levelOrder(root1)); //1 3 2
  }
}

class Solution6 {
  //Function to return the level order traversal of a tree.
  static ArrayList<Integer> levelOrder(Node root) {
    // Your code here
    ArrayList<Integer> res = new ArrayList<>();
    getLevelOrderTraversal(root, res);
    return res;
  }

  private static void getLevelOrderTraversal(Node root,
                                             ArrayList<Integer> res) {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    while (!queue.isEmpty()) {

      // poll() removes the present head.
      Node tempNode = queue.poll();
      res.add(tempNode.data);

      // Enqueue left child
      if (tempNode.left != null) {
        queue.add(tempNode.left);
      }

      // Enqueue right child
      if (tempNode.right != null) {
        queue.add(tempNode.right);
      }
    }
  }
}

