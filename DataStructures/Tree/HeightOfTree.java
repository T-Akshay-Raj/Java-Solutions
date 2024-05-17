package DataStructures.Tree;
/*
Height of Binary Tree

Given a binary tree, find its height.

Example 1:
Input:
     1
    /  \
   2    3
Output: 2

Example 2:
Input:
  2
   \
    1
   /
 3
Output: 3
Your Task:
You don't need to read input or print anything. Your task is to complete the function height() which takes root node of the tree as input parameter and returns an integer denoting the height of the tree. If the tree is empty, return 0.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= Number of nodes <= 105
1 <= Data of a node <= 109
 */
public class HeightOfTree {
  public static void main(String[] args) {
    //Input: root = [1,2,3,4,5]

    TreeNode tree= new TreeNode(1);
    tree.left = new TreeNode(2);
    tree.right = new TreeNode(3);
    tree.left.left = new TreeNode(4);
    tree.left.right = new TreeNode(5);

    System.out.println("Height of the Tree is : "+findHeight(tree));
  }

  private static int findHeight(TreeNode tree) {
    if(tree==null)  return 0;
    else{
      int lHeight=findHeight(tree.left);
      int rHeight=findHeight(tree.right);

      return lHeight>rHeight?lHeight+1:rHeight+1;
    }
  }
}
