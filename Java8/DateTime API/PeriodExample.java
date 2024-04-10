package Java8.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
  public static void main(String[] args) {
    Period p1 = Period.of(1, 1, 1);
    Period p2 = Period.ofDays(100);

    LocalDate ld1 = LocalDate.of(2022, 1, 1);
    LocalDate ld2 = LocalDate.now();
    Period p3 = Period.between(ld1, ld2);

    long nrOfDaysBetweenTheDates = ChronoUnit.DAYS.between(ld1, ld2);

    System.out.println(p1);//P1Y1M1D
    System.out.println(p2);//P100D
    System.out.println(p3);//P2Y3M9D
    System.out.println(p3.getDays());//9
    System.out.println(nrOfDaysBetweenTheDates);//830
  }
}
