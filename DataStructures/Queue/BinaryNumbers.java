package DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;

/*Given a Number n, print binary numbers from 1 to n using Queue.*/
public class BinaryNumbers {
  public static void main(String[] args) {
//    printBinaryNumbers(5);
//    printBinaryNumbers(-10);
//    printBinaryNumbers(0);
//    printBinaryNumbers(10);

    printBinaryNumbers1(10);
  }
/*
The time complexity of this function is O(n) because the function iterates through the numbers from 1 to n and performs constant time operations for each number.
The space complexity of this function is also O(n) because the function uses a queue to store the binary numbers and the size of the queue grows linearly with the input n.
 */
  private static void printBinaryNumbers(int n) {
    System.out.println("Binary of given Number from 1 to " + n + " are: ");
    if (n <= 0) {
      return;
    }
    Queue<Integer> binaryQueue = new LinkedList<>();
    binaryQueue.add(1);
    for (int i = 0; i < n; i++) {
      int current = binaryQueue.poll();
      System.out.println(current);
      binaryQueue.add(current * 10);
      binaryQueue.add(current * 10 + 1);
    }
  }

  /*
  The time complexity of this code is O(n) because the loop iterates from 1 to n, printing the binary representation of each number.
  The space complexity is also O(n) because the binary representation of each number is stored in memory before being printed.
   */
//built in method to convert decimal to binary using Integer.toBinaryString
  private static void printBinaryNumbers1(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.println(Integer.toBinaryString(i));
    }
  }

  //method to print binary numbers from 1 to n
  // Not recommended as each append to string creates a new string
  /*   The time complexity of this code is O(n) and the space complexity is also O(n).
The time complexity is O(n) because the loop runs n times, where n is the input parameter. Within each iteration of the loop, the operations of polling from the queue and adding elements to the queue are constant time operations.
The space complexity is also O(n) because the queue can potentially store up to n elements at any given time. Each element in the queue is a string of length log(n) (since we are adding "0" or "1" to the end of the string in each iteration), so the total space complexity is O(n * log(n)), which simplifies to O(n) since log(n) is a constant factor.
   */
  private static void printBinaryNumbers2(int n) {
    Queue<String> queue = new LinkedList<>();
    queue.add("1");
    for (int i = 1; i <= n; i++) {
      String s1 = queue.poll();
      System.out.println(s1);
      queue.add(s1 + "0");
      queue.add(s1 + "1");
    }
  }

}
