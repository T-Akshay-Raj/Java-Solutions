package DataStructures.Tree.basic;

class SizeOfBinaryTree {
  public static void main(String[] args) {

    //Example 1:
    Node
        root = new Node(10);
    root.left = new Node(4);
    root.right = new Node(6);
    System.out.println(Solution2.getSize(root));//Output: 3

    //Example 2:
    Node root1 = new Node(4);
    root1.left = new Node(9);
    root1.right = new Node(0);
    root1.left.left = new Node(5);
    root1.left.right = new Node(1);

    System.out.println(Solution2.getSize(root1)); //Output: 5
  }
}

class Solution2 {
  public static int getSize(Node node) {
    // code here
    if (node == null) {
      return 0;
    }
    return 1 + getSize(node.left) + getSize(node.right);
  }
}