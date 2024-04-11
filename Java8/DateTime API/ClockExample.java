package Java8.datetime;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class ClockExample {
  public static void main(String[] args) {
    //Ways to create clock
    Clock clock = Clock.systemDefaultZone();
    Clock clock1 = Clock.system(ZoneId.of("Asia/Calcutta"));
    Clock clock2 = Clock.systemUTC();
    Clock clock3 = Clock.fixed(Instant.now(), ZoneId.of("Asia/Calcutta"));
    Clock clock4=Clock.offset(clock3, Duration.ofHours(2));

    System.out.println(clock);//SystemClock[Asia/Calcutta]
    System.out.println(clock1);//SystemClock[Asia/Calcutta]
    System.out.println(clock2);//SystemClock[Z]
    System.out.println(clock3);//FixedClock[2024-04-10T05:31:37.115Z,Asia/Calcutta]
    System.out.println(clock4);//OffsetClock[FixedClock[2024-04-10T07:31:37.115Z,Asia/Calcutta],PT2H]

    //Use clock.instant to print only datetime
    System.out.println(clock4.instant());//2024-04-10T07:31:37.115Z

    //Use along with Instant
    Instant instant=Clock.systemDefaultZone().instant();
    Instant instant1=clock.instant();

    System.out.println(instant);//2024-04-10T05:34:40.631Z
    System.out.println(instant1);//2024-04-10T05:34:40.631Z
  }
}
