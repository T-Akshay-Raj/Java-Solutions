package Collections.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//Rotate array k time using queue
//Time Complexity: O(n) and Space Complexity :O(n) because we use data structure to store elements
public class RotateArrayToK {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6};

    //Rotate array to k times
    int k = 2;
    rotateArray(a, k);
    System.out.println(Arrays.toString(a));


  }

  private static void rotateArray(int[] a, int k) {
    //code to rotate array k times to the left
    Queue<Integer> queue = new LinkedList<>();
    // Add elements to queue of type linkedlist  using streams  and then remove k elements from the front and add them to the start of the queue

    Arrays.stream(a).forEach(queue::add);
    for (int i = 0; i < k; i++) {
      queue.add(queue.remove());
    } //end of for loop
    //Add elements from queue to array using streams
    Arrays.setAll(a, i -> queue.remove());

  }
}
