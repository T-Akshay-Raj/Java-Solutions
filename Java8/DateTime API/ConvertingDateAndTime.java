package Java8.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ConvertingDateAndTime {
  public static void main(String[] args) {
    Date date = new Date(122, 5, 10);
    LocalDateTime ldt = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    System.out.println(ldt);//2022-06-10T00:00

    Calendar calendar = Calendar.getInstance();
    LocalDateTime ldt2 = calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    System.out.println(ldt2);//2024-04-10T12:24:12.917
  }
}
