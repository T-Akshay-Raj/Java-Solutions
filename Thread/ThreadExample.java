//package Thread;
//
//public class ThreadExample {
//  public static void main(String[] args) throws InterruptedException {
//    Thread t = new Thread(() -> {
//      try {
//        t.sleep(1000);
//        System.out.println(t.getState());
//      } catch (InterruptedException e) {
//        System.out.println(t.getState());
//        Thread.currentThread().interrupt();
//      }
//    }
//    );
//    System.out.println("state before start of thread : " + t.getState());
//    t.start();
//    System.out.println("state after start of thread : " + t.getState());
//    t.join();//wait for thread to finish
//    System.out.println("state after completion: " + t.getState());
//  }
//}
