package Collections.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDeQueue {
  public static void main(String[] args) {
    Deque<String> stack = new ArrayDeque<>();
    System.out.println("Stack is empty: " + stack.isEmpty());
    System.out.println("Adding elements to the stack");
    populateStack(stack);
    System.out.println("Stack elements are: " + stack);
    System.out.println("Removing element from the stack: ");
    removeElement(stack);
  }

  private static void populateStack(Deque<String> fruits) {
    fruits.push("apple");
    fruits.push("banana");
    fruits.push("carrot");
    fruits.push("Dragon fruit");

  }

  private static void removeElement(Deque<String> fruits) {
    while (fruits.isEmpty() != true) {
      System.out.println("Removing element: " + fruits.remove());
    }
  }
}
