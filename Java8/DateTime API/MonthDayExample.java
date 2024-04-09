package Java8.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class MonthDayExample {
  public static void main(String[] args) {
    MonthDay md = MonthDay.now();
    MonthDay md1 = MonthDay.of(4, 9);
    MonthDay md2 = MonthDay.of(Month.APRIL, 9);
    MonthDay md3 = MonthDay.of(Month.of(4), 9);

    System.out.println(md);//--04-09
    System.out.println(md1);//--04-09
    System.out.println(md2);//--04-09
    System.out.println(md3);//--04-09

    LocalDate ld=md.atYear(2024);
    System.out.println(ld);//2024-04-09
  }
}
