package Thread;



public class EvenOddThread {
  public static void main(String[] args) {
    //Given Two threads printing even number and odd number, print the numbers in sequence
    //Output should be 1,2,3,4,5,6,7,8,9,10
    Thread evenThread = new Thread(() -> {
      for (int i = 1; i <= 10; i++) {
        if (i % 2 == 0) {
          //add wait and notify

          System.out.println(i);
        }
      }
    });
    Thread oddThread = new Thread(() -> {
      for (int i = 1; i <= 10; i++) {
        if (i % 2 != 0) {
          System.out.println(i);
        }
      }
    });

    evenThread.start();
    oddThread.start();

    //Join the threads to print the numbers in sequence using join and wait for the threads to finish
    try {
      evenThread.join();
      oddThread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
