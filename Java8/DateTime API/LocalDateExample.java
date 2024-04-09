package Java8.datetime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
  public static void main(String[] args) {
    //Ways to create date using LocalDate
    LocalDate ld = LocalDate.now();
    LocalDate ld1 = LocalDate.of(2024, 04, 9);
    LocalDate ld2 = LocalDate.of(2024, Month.APRIL, 9);

    System.out.println(ld);//2024-04-09
    System.out.println(ld1);//2024-04-09
    System.out.println(ld2);//2024-04-09
  }
}
