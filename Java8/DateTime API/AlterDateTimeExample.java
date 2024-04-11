package Java8.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class AlterDateTimeExample {
  public static void main(String[] args) {
    //Alter to dateTime creates new instance
    LocalDateTime ldt1 = LocalDateTime.now();

    // plus and minus methods
    LocalDateTime ldt2 = ldt1.plusMinutes(8);

    //Using Period
    LocalDateTime ldt3 = ldt1.plus(Period.ofWeeks(1));

    //Using Duration
    LocalDateTime ldt4 = ldt1.minus(Duration.ofHours(12));

    // with methods
    LocalDateTime ldt5 = ldt1.withMonth(9);

    System.out.println(ldt1);//2024-04-10T12:13:04.398
    System.out.println(ldt2);//2024-04-10T12:21:04.398
    System.out.println(ldt3);//2024-04-17T12:13:04.398
    System.out.println(ldt4);//2024-04-10T00:13:04.398
    System.out.println(ldt3);//2024-04-17T12:13:04.398
  }
}
