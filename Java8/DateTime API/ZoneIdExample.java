package Java8.datetime;

import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneIdExample {
  public static void main(String[] args) {
    ZoneId z = ZoneId.systemDefault();
    ZoneId z1 = ZoneId.of("Asia/Calcutta");

    System.out.println(z);// Asia/Calcutta
    System.out.println(z1);// Asia/Calcutta

    // To View and Prints all ZoneId's
    for (String zoneId : ZoneId.getAvailableZoneIds()) {
      System.out.print(zoneId);
      ZoneId temp = ZoneId.of(zoneId);
      System.out.println(" : "+temp.getDisplayName(TextStyle.FULL, Locale.ENGLISH));//example: Europe/Monaco : Central European Time
    }

  }
}
