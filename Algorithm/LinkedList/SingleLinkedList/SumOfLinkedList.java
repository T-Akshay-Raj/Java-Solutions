package Algorithms.LinkedList.SingleLinkedList;

public class SumOfLinkedList {
  public static void main(String[] args) {
    //Example 1: [1,2,3,4,5]
    SumOfLinkedList sum = new SumOfLinkedList();
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    System.out.println("Given LinkedList Elements");
    sum.printLinkedList(node);
    System.out.println("Sum of Elements of Linked List: " + sum.findSum(node));
  }

  private int findSum(ListNode node) {
    int sum = 0;
    if (node == null) {
      return 0;
    }
    while (node!= null) {
      sum += node.val;
      node = node.next;
    }
    return sum;
  }

  private void printLinkedList(ListNode head) {
    while (head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }
    System.out.println();
  }
}
