package DataStructures.Tree.basic;

/*
Given a Binary Tree of size N, You have to count leaves in it. For example, there are two leaves in following tree
        1
     /      \
   10      39
  /
5
Example 1:
Input:
Given Tree is
               4
             /   \
            8     10
           /     /   \
          7     5     1
         /
        3
Output:
3
Explanation:
Three leaves are 3 , 5 and 1.
Your Task: You don't have to take input. Complete the function countLeaves() that takes root node of the given tree as parameter and returns the count of leaves in tree. The printing is done by the driver code.
Constraints: 1<= N <= 104
Company Tags: Samsung, Ola Cabs Topic Tags: Tree, Data Structures
 */
public class CountLeavesInBinaryTree {
  public static void main(String[] args) {
    Solution3 sol = new Solution3();
    Node root = new Node(10);
    root.left = new Node(4);
    root.right = new Node(6);
    System.out.println(sol.countLeaves(root));//Output: 2

    //Example 2:
    Node root1 = new Node(4);
    root1.left = new Node(8);
    root1.right = new Node(10);
    root1.left.left = new Node(7);
    root1.right.left = new Node(5);
    root1.right.right = new Node(1);
    root1.left.left.left = new Node(3);

    System.out.println(sol.countLeaves(root1)); //Output: 3
  }
}

class Solution3 {
  int countLeaves(Node node) {
    // Your code
    if (node == null) {
      return 0;
    }
    if (node.left == null && node.right == null) {
      return 1;
    }
    return countLeaves(node.left) + countLeaves(node.right);
  }
}
