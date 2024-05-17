package DataStructures.Tree;

import DataStructures.Tree.basic.Node;
import java.util.ArrayList;

/* Postorder Traversal:
Post order => Left, Right, Root.

Given a binary tree, find the Postorder Traversal of it.
For Example, the postorder traversal of the following tree is:
5 10 39 1

        1
     /     \
   10     39
  /
5


Example 1:

Input:
        19
     /     \
    10      8
  /    \
 11    13
Output: 11 13 10 8 19
Example 2:

Input:
          11
         /
       15
      /
     7
Output: 7 15 11

Your Task:
You don't need to read input or print anything. Your task is to complete the function postOrder() that takes root node as input and returns an array containing the postorder traversal of the given Binary Tree.


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).


Constraints:
1 <= Number of nodes <= 105
0 <= Data of a node <= 106


Company Tags:Morgan Stanley, Snapdeal, Walmart
Topic Tags: Tree, Data Structures
 */
public class PostOrderTraversal {
  public static void main(String[] args) {

    Solution5 sol = new Solution5();
    Node root = new Node(1);
    root.left = new Node(10);
    root.right = new Node(39);
    root.left.left = new Node(5);
    System.out.println(sol.postOrder(root));//Output: 5 10 39 1

    //Example 2:
    Node root1 = new Node(19);
    root1.left = new Node(10);
    root1.right = new Node(8);
    root1.left.left = new Node(11);
    root1.left.right = new Node(13);
    System.out.println(sol.postOrder(root1));//Output: 11 13 10 8 19

    //Example 3:
    Node root2 = new Node(11);
    root2.left = new Node(15);
    root2.left.left = new Node(7);
    System.out.println(sol.postOrder(root2));//Output: 7 15 11

  }
}
  class Solution5
  {
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
      // Your code goes here
      ArrayList<Integer> res=new ArrayList<>();
      getPostOrder(root,res);
      return res;
    }

    private void getPostOrder(Node root, ArrayList<Integer> res) {
      if(root==null) return;
      getPostOrder(root.left,res);
      getPostOrder(root.right,res);
      res.add(root.data);
    }

  }
