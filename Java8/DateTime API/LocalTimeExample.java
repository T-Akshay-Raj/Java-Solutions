package Java8.datetime;

import java.time.LocalTime;

public class LocalTimeExample {
  public static void main(String[] args) {
    LocalTime lt = LocalTime.now();
    LocalTime lt1 = LocalTime.of(23, 35, 32);
    LocalTime lt2 = LocalTime.of(23, 35);

    System.out.println(lt);//23:35:32.309
    System.out.println(lt1);//23:35:32
    System.out.println(lt2);//23:35
  }
}
