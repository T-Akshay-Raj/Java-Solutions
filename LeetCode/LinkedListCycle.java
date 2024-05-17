package LeetCode;


import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
  class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public static void main(String[] args) {
    LinkedListCycle linkedListCycle = new LinkedListCycle();
    LinkedListCycle.ListNode head = linkedListCycle.new ListNode(1);
    head.next = linkedListCycle.new ListNode(2);
    head.next.next = linkedListCycle.new ListNode(3);
    head.next.next.next = head;
    System.out.println(linkedListCycle.hasCycle(head));
  }

  //The time complexity of this solution is O(n) because we iterate through the entire linked list once, where n is the number of nodes in the linked list.
  //The space complexity is also O(n) because we are using a HashSet to store the nodes we have visited, and in the worst case scenario, we would need to store all n nodes in the HashSet.
  public boolean hasCycle(ListNode head) {
    Set<ListNode> set = new HashSet<>();
    ListNode current = head;
    while (current != null) {

      if (set.contains(current)) {
        return true;
      }
      set.add(current);
      current = current.next;
    }
    return false;
  }
//The time complexity of this algorithm is O(n) where n is the number of nodes in the linked list. This is because in the worst case scenario, the algorithm will iterate through all the nodes in the linked list once.
//The space complexity of this algorithm is O(1) because it uses only a constant amount of extra space regardless of the size of the input linked list.
  public boolean hasCycle1(ListNode head) {
    ListNode slow = head, fast = head;
    if (head == null) {
      return false;
    }
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }
}
