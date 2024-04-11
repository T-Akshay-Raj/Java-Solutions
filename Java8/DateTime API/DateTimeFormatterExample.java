package Java8.datetime;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterExample {
  public static void main(String[] args) {
    LocalDateTime ldt=LocalDateTime.now();
    String dateTime= DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(ldt);
    String formattedDate = DateTimeFormatter.BASIC_ISO_DATE.format(ldt);

    System.out.println(dateTime);//2024-04-10T11:30:52.447
    System.out.println(formattedDate);//20240410

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yy");
    String formatStyleDate = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt);
    String formatStyleDate1=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(ldt);


    System.out.println(dtf.format(ldt));//10-April-2024
    System.out.println(dtf1.format(ldt));//04/10/24

    System.out.println(formatStyleDate);//Apr 10, 2024 11:33:44 AM
    System.out.println(formatStyleDate1);//4/10/24 11:33 AM
  }
}
