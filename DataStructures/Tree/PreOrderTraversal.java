package DataStructures.Tree;

import DataStructures.Tree.basic.Node;
import java.util.ArrayList;

public class PreOrderTraversal {
  public static void main(String[] args) {
    BinaryTree btree= new BinaryTree();
    Node root = new Node(1);
    root.left = new Node(3);
    root.right = new Node(2);
    System.out.println(btree.preorder(root));//Output: 1 3 2

    //Example 2:
    Node root1 = new Node(1);
    root1.left = new Node(4);
    root1.left.left = new Node(4);
    root1.left.right = new Node(2);
    System.out.println(btree.preorder(root1));//Output: 1 4 4 2

    //Example 3:
    Node root2 = new Node(6);
    root2.left = new Node(3);
    root2.right = new Node(2);
    root2.left.right = new Node(1);
    root2.right.left = new Node(2);

    System.out.println(btree.preorder(root2)); //Output: 6 3 1 2 2
  }
}
class BinaryTree
{
  //Function to return a list containing the preorder traversal of the tree.
  static ArrayList<Integer> preorder(Node root)
  {
    // Code here
    ArrayList<Integer> res=new ArrayList<>();
    getPreOrderTraversal(root,res);
    return res;
  }

  private static void getPreOrderTraversal(Node root, ArrayList<Integer> res) {
   if(root==null) return;
   res.add(root.data);
   getPreOrderTraversal(root.left,res);
   getPreOrderTraversal(root.right,res);
  }

}
