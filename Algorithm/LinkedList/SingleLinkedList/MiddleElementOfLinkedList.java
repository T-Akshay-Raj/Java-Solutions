package Algorithms.LinkedList.SingleLinkedList;
/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.


Constraints:
The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100

Topics: Linked List, Two Pointers
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiddleElementOfLinkedList {
  public static void main(String[] args) {
    MiddleElementOfLinkedList meol = new MiddleElementOfLinkedList();

    //Example 1: [1,2,3,4,5]
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);

    System.out.println(meol.middleNode(node).val); //3

    //Example 2: [1,2,3,4,5,6]
    ListNode node1 = new ListNode(1);
    node1.next = new ListNode(2);
    node1.next.next = new ListNode(3);
    node1.next.next.next = new ListNode(4);
    node1.next.next.next.next = new ListNode(5);
    node1.next.next.next.next.next = new ListNode(6);

    System.out.println(meol.middleNode(node1).val); //4


    //Example 3: [3, 1, 7, 2]
    ListNode node2 = new ListNode(3);
    node2.next = new ListNode(1);
    node2.next.next = new ListNode(7);
    node2.next.next.next = new ListNode(2);
    System.out.println(meol.middleNode(node2).val); //7

    //    System.out.println("Using Naive Approach: ");
    //    System.out.println(meol.middleNode1(node2).val); //7



    //Example 4: [3, 1]
    ListNode node3 = new ListNode(3);
    node3.next = new ListNode(1);
    System.out.println(meol.middleNode(node3).val); //7


  }
// Floyd's cycle finding algorithm aka Hare-Tortoise algorithm
  // Time Complexity: O(n) and Space Complexity: O(1)
  public ListNode middleNode(ListNode head) {
    ListNode slow=head, fast=head;
    while(fast!=null && fast.next!=null)
    {
      slow=slow.next;
      fast=fast.next.next;
    }
    return slow;
  }

  //Approach 2: Naive Approach: Save the elements into array or list and get element at length/2
  //Time Complexity: O(n) and Space Complexity: O(n) since we are using additional datastructures of size n
  public ListNode middleNode1(ListNode head) {
    List<ListNode> tempList=new ArrayList<>();
    while(head!=null)
    {
      tempList.add(head);
      head=head.next;
    }
    return tempList.get(tempList.size()/2);
  }
}
