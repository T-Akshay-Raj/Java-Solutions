package Java7;

public class MemoryManagement {
  public static void main(String[] args) {
    System.out.println("Available Processors: " + Runtime.getRuntime().availableProcessors());
    System.out.println("Total Memory: " + Runtime.getRuntime().totalMemory());
    System.out.println("Max memory: " + Runtime.getRuntime().maxMemory());
    System.out.println("Free Memory: " + Runtime.getRuntime().freeMemory());
    //Notify garbage Collector to initiate garbage collection, this call doesn't guarantee garbage collector to run at that particular instance
    Runtime.getRuntime().gc();
    //alternative to Runtime.gc(). this call doesn't guarantee garbage collector to run at that particular instance
    System.gc();
    Runtime.getRuntime().exit(0);
  }
}
