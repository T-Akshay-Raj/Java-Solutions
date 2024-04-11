package Java8.datetime;

import java.time.LocalDateTime;

public class ComparingDateTimeExample {
  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();
    LocalDateTime ldt1 = LocalDateTime.of(2024, 4, 10, 11, 19);

    System.out.println("Using compareTo : " + ldt.compareTo(ldt1));//1
    System.out.println("Using isAfter : " + ldt.isAfter(ldt1));//true
    System.out.println("Using isBefore : " + ldt.isBefore(ldt1));//false
    System.out.println("Using isEqual : " + ldt.isEqual(ldt1));//false
  }
}
