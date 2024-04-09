package Java8.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class YearMonthExample {
  public static void main(String[] args) {
    YearMonth ym=YearMonth.now();
    YearMonth ym1=YearMonth.of(2024,4);
    YearMonth ym2=YearMonth.of(2024,Month.APRIL);

    System.out.println(ym);//2024-04
    System.out.println(ym1);//2024-04
    System.out.println(ym2);//2024-04

    LocalDate ld=ym.atDay(9);
    System.out.println(ld);//2024-04-09
  }
}
