package Java8.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
  public static void main(String[] args) {
    Duration d1 = Duration.of(1, ChronoUnit.DAYS);
    Duration d2 = Duration.ofHours(5);

    LocalTime lt1 = LocalTime.now();
    LocalTime lt2 = LocalTime.of(15, 0);
    Duration d3 = Duration.between(lt1, lt2);

    System.out.println(d1);//PT24H
    System.out.println(d2);//PT5H
    System.out.println(d3);//PT2H57M14.818S
  }
}
