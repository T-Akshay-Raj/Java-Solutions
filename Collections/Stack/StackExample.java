package Collections.Stack;

import java.util.Stack;

//Stack follow First In Last Out (FILO) principle
public class StackExample {
  public static void main(String[] args) {
    Stack stack = new Stack();
    System.out.println("Stack is empty: " + stack.isEmpty());
    System.out.println("Adding elements to the stack");
    populateStack(stack);
    System.out.println("Stack elements are: " + stack);
    System.out.println("Removing element from the stack: ");
    removeElement(stack);
  }

  private static void populateStack(Stack stack) {
    stack.push("apple");
    stack.push("banana");
    stack.push("carrot");
    stack.push("Dragon fruit");

  }

  //Removing from the most recent insertion
  private static void removeElement(Stack stack) {
    while (stack.isEmpty() != true) {
      System.out.println("Removing element: " + stack.pop());
    }
  }
}
