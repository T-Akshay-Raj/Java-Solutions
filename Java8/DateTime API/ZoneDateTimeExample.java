package Java8.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeExample {
  public static void main(String[] args) {
    ZonedDateTime zoneDateTime= ZonedDateTime.now();
    ZonedDateTime zoneDateTime1= ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
    ZonedDateTime zoneDateTime2=ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("GMT"));
    ZonedDateTime zonedDateTime3=ZonedDateTime.of(LocalDate.now(), LocalTime.now(),ZoneId.of("Asia/Calcutta"));

    System.out.println(zoneDateTime);//2024-04-10T00:15:00.629+05:30[Asia/Calcutta]
    System.out.println(zoneDateTime1);//2024-04-10T00:15:00.629+05:30[Asia/Calcutta]
    System.out.println(zoneDateTime2);//2024-04-10T00:20:26.475Z[GMT]
    System.out.println(zonedDateTime3);////2024-04-10T00:15:00.629+05:30[Asia/Calcutta]
  }
}
