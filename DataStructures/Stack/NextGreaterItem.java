package DataStructures.Stack;

import java.util.Stack;

//Next greater item using stack
public class NextGreaterItem {
  public static void main(String[] args) {
    int[] arr = {4, 5, 2, 10, 8};
    nextGreaterItem(arr);//4-->5,     2-->10,     5-->10,     8-->-1,     10-->-1

    int[] arr2 = {16, 7, 2, 15};
    nextGreaterItem(arr2); //2-->15,     7-->15,     15-->-1,     16-->-1

  }

  //Using stack
  private static void nextGreaterItem(int[] arr) {
    if (arr.length == 0) {
      return;
    }
    Stack<Integer> stack = new Stack<>();
    stack.push(arr[0]);

    for (int i = 1; i < arr.length; i++) {
      int next = arr[i];
      if (!stack.empty()) {
        int popped = stack.pop();
        while (popped < next) {
          System.out.println(popped + "-->" + next);
          if (stack.empty()) {
            break;
          }
          popped = stack.pop();
        }
        if (popped > next) {
          stack.push(popped);
        }
      }
      stack.push(next);
    }
      while (!stack.empty()) {
        System.out.println(stack.pop() + "-->" + -1);
      }
    }
  }
