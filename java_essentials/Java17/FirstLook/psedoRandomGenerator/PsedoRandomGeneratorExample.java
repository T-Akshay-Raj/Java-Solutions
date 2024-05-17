package java_essentials.Java17.FirstLook.psedoRandomGenerator;

import java.util.Random;

public class PsedoRandomGeneratorExample {
  public static void main(String[] args) {
    //java 17 feature - Pseudo Random Generator
    //The java.util.Random class is used to generate random numbers in Java. The Random class provides methods to generate random numbers of different data types such as int, long, float, and double.
    Random random = new Random();
    //java 17 examples for Random class
    //1. Generating random integers
    System.out.println("Random integers: " + random.nextInt());
    System.out.println("Random integers: " + random.nextInt(100));
    //2. Generating random long numbers
    System.out.println("Random long numbers: " + random.nextLong());
    //3. Generating random float numbers
    System.out.println("Random float numbers: " + random.nextFloat());
    //4. Generating random double numbers
    System.out.println("Random double numbers: " + random.nextDouble());
    //5. Generating random boolean values
    System.out.println("Random boolean values: " + random.nextBoolean());
    //6. Generating random bytes
    byte[] bytes = new byte[5];
    random.nextBytes(bytes);
    System.out.println("Random bytes: " + new String(bytes));
    //7. Generating random Gaussian values
    System.out.println("Random Gaussian values: " + random.nextGaussian());

    //java 17 feature - All features with examples
    //1. Generating random integers
    System.out.println("Random integers: " + random.nextInt());
    System.out.println("Random integers: " + random.nextInt(100));
    //2. Sealed classes
    //3. Pattern matching for switch
    //4. Text blocks
    //5. Records
    //6. Instanceof pattern matching
    //7. Local variable type inference
    //8. Lambda expression
    //9. Method reference
    //10. Stream API
    //11. Optional class
    //12. CompletableFuture
    //13. Parallel streams
    //14. Collectors
    //15. Functional interfaces
    //16. Default methods
    //17. Static methods
    //18. Interface private methods
    //19. Interface private static methods
    //20. Interface private default methods
    //21. Interface private abstract methods
    //22. Interface private final methods
    //23. Interface private final static methods
    //24. Interface private final default methods




  }
}
