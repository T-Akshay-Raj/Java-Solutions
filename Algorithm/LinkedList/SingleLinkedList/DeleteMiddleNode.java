package Algorithms.LinkedList.SingleLinkedList;

import java.util.LinkedList;

/*
You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.


Example 1:

Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]
Explanation:
The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node.

Example 2:
Input: head = [1,2,3,4]
Output: [1,2,4]
Explanation:
The above figure represents the given linked list.
For n = 4, node 2 with value 3 is the middle node, which is marked in red.
Example 3:


Input: head = [2,1]
Output: [2]
Explanation:
The above figure represents the given linked list.
For n = 2, node 1 with value 1 is the middle node, which is marked in red.
Node 0 with value 2 is the only node remaining after removing node 1.


Constraints:

The number of nodes in the list is in the range [1, 105].
1 <= Node.val <= 105

Topics: Linked List, Two Pointers
 */
public class DeleteMiddleNode {
  public static void main(String[] args) {
    DeleteMiddleNode dmn = new DeleteMiddleNode();
    //Example 1: [1,2,3,4,5]
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    System.out.println("Before Deleting");
    dmn.printLinkedList(node);
    ListNode newHeadNode = dmn.deleteMiddle(node);
    System.out.println("After Deleting");
    dmn.printLinkedList(newHeadNode);


    ListNode node1 = new ListNode(1);
    ListNode newHeadNode1 = dmn.deleteMiddle(node1);
    System.out.println("After Deleting");
    dmn.printLinkedList(newHeadNode1);
  }

  public ListNode deleteMiddle(ListNode head) {
    if (head == null || head.next == null) {
      return null;
    }
    ListNode slow = head;
    ListNode fast = head;
    ListNode dummy = head;

    while (fast != null && fast.next != null) {
      dummy = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    dummy.next = slow.next;
    return head;
  }

  private void printLinkedList(ListNode head) {
    while (head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }
    System.out.println();
  }
}
