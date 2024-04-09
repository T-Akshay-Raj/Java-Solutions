package Java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();
    LocalDateTime ldt2 = LocalDateTime.of(2024, 04, 9, 23, 35, 32,309000000);

    LocalDate ld = LocalDate.now();
    LocalTime lt = LocalTime.now();
    LocalDateTime ldt3 = LocalDateTime.of(ld, lt);

    System.out.println(ldt);//2024-04-09T23:35:32.309
    System.out.println(ldt2);//2024-04-09T23:35:32.309
    System.out.println(ldt3);//2024-04-09T23:35:32.309
  }
}
