package Collections.List.LinkedList;

import java.util.HashSet;
import java.util.Set;

//Given a LinkedList , detect if it contains cycle
public class DetectCycle {
  class ListNode {
    int val;
    DetectCycle.ListNode next;

    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public static void main(String[] args) {

    DetectCycle detectCycle = new DetectCycle();
    DetectCycle.ListNode head = detectCycle.new ListNode(1);
    head.next = detectCycle.new ListNode(2);
    head.next.next = detectCycle.new ListNode(3);
    head.next.next.next = head;
    boolean result = DetectCycle.hasCycle(head);
    System.out.println("Has cycle Using Two Pointer: " + result);//true

    boolean result1 = DetectCycle.hasCycle1(head);
    System.out.println("Has cycle Using HashSet: " + result1);//true

  }

  //Check if it has cycled using Two pointer approach
  static boolean hasCycle(DetectCycle.ListNode head) {
    if (head == null) {
      return false;
    }
    //Using fast and slow pointer
    DetectCycle.ListNode slow = head;
    DetectCycle.ListNode fast = head.next;

    while (slow != fast) {
      if (fast == null || fast.next == null) {
        return false;
      }
      slow = slow.next;
      fast = fast.next.next;
    }
    return true;
  }

  //Check if it has cycled using hashSet
  static boolean hasCycle1(DetectCycle.ListNode head) {

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
}


